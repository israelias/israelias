(ns readme)

(defn create-readme [username year]
  {:username username
   :year year
   :name "Joem Elias Sanez"
   :education {"programming" ["Full Stack Software Development" "Code Institute"]
               "architecture" ["Master of Architecture" "Columbia University"]
               "art" ["Bachelor of Fine Arts" "Otis College of Art and Design"]}
   :employment {"engineer" ["ResultsCX" ["Manila" "Fort Lauderdale"]]
                "architect" ["Foster + Partners" ["Singapore" "New York"]]
                "designer" ["Herzog & de Meuron" ["New York" "Basel"]]
                "all of the above" ["you" ["projects" "anywhere"]]}})

(defn doing [readme now]
  (let [today (:year readme)]
    (cond
      (< now today) (let [experience (get-in readme [:employment "architect"])]
                      (str "I was a design architect with " (first experience) " in " (first (second experience)) "."))
      (= now today) (let [dream (get-in readme [:employment "engineer"])]
                      (str "I am currently in Application Development for " (first dream) " in " (first (second dream)) "."))
      (> now today) (let [goal (get-in readme [:employment "all of the above"])]
                      (str "I am eager to collaborate with " (first goal) " on " (first (second goal)) " " (second (second goal)) "."))
      :else "### Hi there 👋")))

(defn collaborate [readme role organization location]
  (assoc-in readme [:employment role] [organization location]))

(def me (create-readme "israelias" 2022))

(println (doing me 2023))