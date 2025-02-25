// Generated by Dagger (https://google.github.io/dagger).
package com.example.svgwithmvi.daggerdependencies;

import com.example.svgwithmvi.model.SVGModel;
import com.example.svgwithmvi.shapehandler.svg.SVGShapeGenerator_Factory;
import com.example.svgwithmvi.shapehandler.svg.SVGShapeManager;
import com.example.svgwithmvi.shapehandler.svg.SVGShapeManager_Factory;
import com.example.testproject.shapehandler.ShapeManager;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerSVGComponent implements SVGComponent {
  private SVGConverterModule_ProvideSVGConverterFactory provideSVGConverterProvider;

  private Provider<SVGShapeManager> sVGShapeManagerProvider;

  private DaggerSVGComponent(Builder builder) {

    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideSVGConverterProvider =
        SVGConverterModule_ProvideSVGConverterFactory.create(builder.sVGConverterModule);
    this.sVGShapeManagerProvider =
        DoubleCheck.provider(
            SVGShapeManager_Factory.create(
                (Provider) SVGShapeGenerator_Factory.create(), provideSVGConverterProvider));
  }

  @Override
  public ShapeManager getShapeProvider() {
    return sVGShapeManagerProvider.get();
  }

  @Override
  public SVGModel getSVGModul() {
    return new SVGModel(sVGShapeManagerProvider.get());
  }

  public static final class Builder {
    private SVGConverterModule sVGConverterModule;

    private Builder() {}

    public SVGComponent build() {
      Preconditions.checkBuilderRequirement(sVGConverterModule, SVGConverterModule.class);
      return new DaggerSVGComponent(this);
    }

    public Builder sVGConverterModule(SVGConverterModule sVGConverterModule) {
      this.sVGConverterModule = Preconditions.checkNotNull(sVGConverterModule);
      return this;
    }
  }
}
