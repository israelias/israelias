class ReadMe:
    def __init__(self, username="israelias", year=2021):
        self.username = username
        self.year = year
        self.name = 'Joem Elias Sanez'
        self.education = {
            'programming': ['Full Stack Software Development', 'Code Institute'],
            'architecture': ['Master of Architecture', 'Columbia University'],
            'art': ['Bachelor of Fine Arts', 'Otis College of Art and Design']
        }
        self.employment = {
            'developer': ['companies', 'cities'],
            'architect': ['Foster + Partners', ['Singapore', 'New York']],
            'designer': ['Herzog & de Meuron', ['New York', 'Basel']],
            'all of the above': ['you', ['projects', 'anywhere']],
        }

    def doing(self, now=2021):
        today = self.year

        if now < today:
            experience = self.employment['architect']
            return """
            I was a design architect with {large_firms} in {big_cities}.
            """.format(large_firms=experience[0], big_cities=experience[1][0])

        elif now == today:
            dream = self.education['programming']
            return """
            I am currently learning {code} at {code_institute}.
            """.format(code=dream[0], code_institute=dream[1])

        elif now > today:
            goal = self.employment['developer']
            return """
            I am eager to collaborate with {teams} on {projects}.
            """.format(teams=goal[0], projects='software development')
        else:
            return """
            ### Hi there 👋
            """

    def collaborate(self, role, organization, location):
        opportunity = self.employment
        opportunity[role] = [organization, location]


me = ReadMe(2021)

print(me.doing(2023))
