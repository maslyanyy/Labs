from ua.com.lviv.iot.Technique import *


class Light(Technique):
    def __init__(self, name="unknown", amount=0,run= 0 ):
        super().__init__(name, amount,run)
        self.type = Types.LIGHT.name
        self.wheel = WheelType.Wheel.WOODEN.name
        self.gazolineType = GazolineType.Gaz.A95.name
