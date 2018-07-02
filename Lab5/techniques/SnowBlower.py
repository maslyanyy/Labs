from techniques.Technique import *


class SnowBlower(Technique):
    def __init__(self,name="unknown", amount=0,run = 0):
        super().__init__( name, amount,run)
        self.type = Types.SNOWBLOWER.name
        self.wheel = WheelType.Wheel.METAL.name
        self.gazolineType = GazolineType.Gaz.A92.name

