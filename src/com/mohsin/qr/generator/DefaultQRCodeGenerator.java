package com.mohsin.qr.generator;

import net.glxn.qrgen.image.ImageType;

public class DefaultQRCodeGenerator extends AbstractQRCodeGenerator {
    @Override
    protected ImageType getImageType() {
        return ImageType.PNG; // Default to PNG for better compatibility
    }
}
