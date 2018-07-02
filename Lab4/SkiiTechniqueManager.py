class SkiiTechniqueManager:
    techList = []

    def add_good(self, tech):
        self.techList.append(tech)

    def find_type(self, type):
        result = []
        for tech in self.techList:
            if tech.type == type:
                print(tech.to_string())
                result.append(tech)
        return result

    def find_wheel(self, wheel):
        result = []
        for tech in self.techList:
            if tech.wheel == wheel:
                result.append(tech)
                print(tech.to_string())
        return result

    def find_gaz(self, gaz):
        result = []
        for tech in self.techList:
            if tech.gazolineType == gaz:
                result.append(tech)
                print(tech.to_string())
        return result

    def sort_run(self):
        return sorted(self.techList, key=lambda tech: tech.run)

    def print_list(self):
        for x in self.techList:
            print(x.to_string(), "\n")
