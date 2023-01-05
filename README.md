```python
class ReadMe:
    def __init__(self, username="israelias", year=2022):
        self.username = username
        self.year = year
        self.name = 'Joem Elias Sanez'
        self.education = {
            'programming': ['Full Stack Software Development', 'Code Institute'],
            'architecture': ['Master of Architecture', 'Columbia University'],
            'art': ['Bachelor of Fine Arts', 'Otis College of Art and Design']
        }
        self.employment = {
            'engineer': ['ResultsCX', ['Manila', 'Fort Lauderdale']],
            'architect': ['Foster + Partners', ['Singapore', 'New York']],
            'designer': ['Herzog & de Meuron', ['New York', 'Basel']],
            'all of the above': ['you', ['projects', 'anywhere']],
        }

    def doing(self, now=2023):
        today = self.year

        if now < today:
            experience = self.employment['architect']
            return """
            I was a design architect with {large_firms} in {big_cities}.
            """.format(large_firms=experience[0], big_cities=experience[1][0])

        elif now == today:
            dream = self.employment['engineer']
            return """
            I am currently in Application Development for {tech_enabled_services} in {remote_settings}.
            """.format(tech_enabled_services=dream[0], remote_settings=dream[1][0])

        elif now > today:
            goal = self.employment['all of the above']
            return """
            I am eager to collaborate with {teams} on {projects} {everywhere}.
            """.format(teams=goal[0], projects=goal[1][0], everywhere=goal[1][1])
        else:
            return """
            ### Hi there 👋
            """
        
    def collaborate(self, role, organization, location):
        opportunity = self.employment
        opportunity[role] = [organization, location]

me = ReadMe(2022)
```
