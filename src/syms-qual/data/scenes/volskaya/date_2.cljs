(ns syms-qual.data.scenes.volskaya.date-2
  (:require [carmen.util :as anim :refer [scoot fade-out]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:apartment :sombra 7]
   [:miranda/dialogue
    ["Sombra" [[:sombra :_neutral2 (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "Hey. Um. Sorry you got stuck with me all day."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_no (scoot 0)]]
     "It was fine. But, I will never be able to scrub the visage of the Chili's man out of my mind. I will never be able to dine at a Chili's. I blame you for that."]
    ["Sombra" [[:sombra :_explainHand (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "That’s fair."]
    ["Symmetra" [[:sombra :_leanin (scoot -3)] [:symmetra :_bored (scoot 0)]]
     "..."]
    ["Sombra" [[:sombra :_nostalgic (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "If I’m going to be honest, I’m having a blast. Getting in trouble and then nestling away with someone cute is my idea of a great afternoon."]
    ["Symmetra" [[:sombra :_nostalgic (scoot -3)] [:symmetra :_scandalized (scoot 0)]]
     "Ms. Sombra!"]
    ["Sombra" [[:sombra :_leanin (scoot -3)] [:symmetra :_scandalized (scoot 0)]]
     "Just two cuties, committing cybercrimes against the military industrial complex. Possibly covertly blowing up millions of dollars of equipment."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_explainAngry (scoot 0)]]
     "You did what?"]
    ["Sombra" [[:sombra :_awkwardSad (scoot -3)] [:symmetra :_WTF (scoot 0)]]
     "I said possibly! And it’s not like it’s a bad thing. You like peace and order, right? Giant mechas are not going to contribute to that."]
    ["Symmetra" [[:sombra :_neutral2 (scoot -3)] [:symmetra :_explain (scoot 0)]]
     "Well, in the future, please do not commit acts of terrorism in the name of my ideals."]
    ["Sombra" [[:sombra :_explainConcerned (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "You talk about this as if it were planned. I just saw an opportunity and went for it.."]
    ["Symmetra" [[:sombra :_neutral2 (scoot -3)] [:symmetra :_angry (scoot 0)]]
     "That does not change the fact that you are a terrorist."]
    ["Sombra" [[:sombra :_explainCondescend (scoot -3)] [:symmetra :_angry (scoot 0)]]
     "A terrorist with an accomplice! You were happy to employ my hacking when it suited your purposes. That’s the problem with you law and order types. You’re very happy to excuse your own transgressions and blame others."]
    ["Symmetra" [[:sombra :_neutral2 (scoot -3)] [:symmetra :_frown (scoot 0)]]
     "I do not think employing military hardware on a battlefield to aid in battle is the same as causing damage to private property."]
    ["Sombra" [[:sombra :_self (scoot -3)] [:symmetra :_WTF (scoot 0)]]
     "Private property, ha, look let me tell y--"]
    ["Symmetra" [[:sombra :_neutral2 (scoot -3)] [:symmetra :_sad (scoot 0)]]
     "But, you are right. I am an accomplice. I should consider my actions more seriously so I do not betray my own ideals."]
    ["Sombra" [[:sombra :_nostalgicSad (scoot -3)] [:symmetra :_sad (scoot 0)]]
     "...oh."]
    [nil [[:sombra :_nostalgicSad (scoot -3)] [:symmetra :_sad (scoot 0)]]
     "You sit in silence for several minutes before Sombra speaks."]
    ["Sombra" [[:sombra :_explainAwkward (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "You know, for an over-serious authoritarian type, you’re surprisingly, um...not a shitbag. It’s refreshing to see someone like you keep your moral code and take personal responsibility, for once."]
    :-> [:apartment :sombra :option 4]]

   [:apartment :sombra :option 4]
   [:miranda/option
    "Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_neutral (scoot 0)]]
    "And for a terrorist, you’re not scum."
    "You may be terrorist scum, but at least I had a good time."]

   [:apartment :sombra :option 4 0]
   [:miranda/dialogue
    ["Sombra" [[:sombra :_explain (scoot -3)] [:symmetra :_smile (scoot 0)]]
     "Not scum I can work with!"]
    ["Sombra" [[:sombra :_flirty (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "Next step, flirting!"]
    ["Symmetra" [[:sombra :_flirty (scoot -3)] [:symmetra :_no (scoot 0)]]
     "Next time, do not start with acts of terrorism."]
    ["Sombra" [[:sombra :_nostalgic (scoot -3)] [:symmetra :_WTF (scoot 0)]]
     "Ease you into dismantling the military-industrial complex, got it. Next time we’ll maybe just throw blood on Volskaya executives."]
    ["Symmetra" [[:sombra :_smile (scoot -3)] [:symmetra :_explainWTF (scoot 0)]]
     "Start smaller."]
    ["Sombra" [[:sombra :_shrugAwkward (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "We’ll shake our fists from far away at the military-industrial complex?"]
    ["Symmetra" [[:sombra :_smile (scoot -3)] [:symmetra :_bored (scoot 0)]]
     "There we go."]
    :-> [:apartment :sombra 8]]

   [:apartment :sombra :option 4 1]
   [:miranda/dialogue
    ["Sombra" [[:sombra :_explainHand (scoot -3)] [:symmetra :_WTF (scoot 0)]]
     "A successful first date, then!"]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_bored (scoot 0)]]
     "I wouldn’t call it a success."]
    ["Sombra" [[:sombra :_explainCondescend (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "A non disastrous first date."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_no (scoot 0)]]
     "I wouldn’t---"]
    ["Sombra" [[:sombra :_explain (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "We didn’t get punched?"]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_explain (scoot 0)]]
     "Sure."]
    ["Sombra" [[:sombra :_shrug (scoot -3)] [:symmetra :_WTF (scoot 0)]]
     "Well there we go!"]
    :-> [:apartment :sombra 8]]

   [:apartment :sombra 8]
   [:miranda/dialogue
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_bewildered (scoot 0)]]
     "I do not like admitting this, but the prank WAS rather humorous."]
    ["Sombra" [[:sombra :_flirty (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "Worth the loss?"]
    ["Symmetra" [[:sombra :_neutral2 (scoot -3)] [:symmetra :_no (scoot 0)]]
     "No."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_thinking (scoot 0)]]
     "...but today wasn’t all bad..."]
    ["Sombra" [[:sombra :_leanin (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "What I’m hearing is that you had a good time hanging out with a cute and debaucherous lady all day but you’re ashamed to admit it."]
    ["Symmetra" [[:sombra :_leanin (scoot -3)] [:symmetra :_thinking (scoot 0)]]
     "Eh. Perhaps."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_explainUncomfortable (scoot 0)]]
     "In any case, I am ready to leave. I think we may be able to recover our bags from the hotel without getting assaulted now."]
    ["Sombra" [[:sombra :_flirty (scoot -3)] [:symmetra :_smile (scoot 0)]]
     "I can risk my skin for you. I’ll infiltrate all sneaky like."]
    ["Symmetra" [[:sombra :_flirty (scoot -3)] [:symmetra :_explainUncomfortable (scoot 0)]]
     "How chivalrous."]
    ["Sombra" [[:sombra :_self (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "Why, thank you!"]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_no (scoot 0)]]
     "But it will not be necessary. I have repaired our standing with Zarya and Mei."]
    ["Sombra" [[:sombra :_surprised (scoot -3)] [:symmetra :_sass (scoot 0)]]
     "Oh really? How so?"]
    ["Symmetra" [[:sombra :_surprised (scoot -3)] [:symmetra :_smug (scoot 0)]] "You are not the only covert operative here. I have been surreptitiously texting them to negotiate a settlement while we hid in this room."]
    ["Symmetra" [[:sombra :_surprised (scoot -3)] [:symmetra :_explain (scoot 0)]]
     "They have agreed to find you exclusively liable and will forgive us on the condition that we both attend their intense personal training 24-7 boot-camp for the next week, for which you will be paying."]
    ["Sombra" [[:sombra :_nostalgicSad (scoot -3)] [:symmetra :_WTF (scoot 0)]]
     "That sounds...expensive."]
    ["Symmetra" [[:sombra :_nostalgicSad (scoot -3)] [:symmetra :_explainWTF (scoot 0)]]
     "I guess you better make sure the bitcoin miners in my turrets are working overtime. Please do not burn anything down."]
    ["Sombra" [[:sombra :_frown (scoot -3)] [:symmetra :_sass (scoot 0)]]
     "Shit."]
    :-> [:sombra-b :cutscene 5]]

   [:sombra-b :cutscene 5]
   [:miranda/characters
    [[]]
    :-> [:sombra-b :cutscene 5 :text]]

   [:sombra-b :cutscene 5 :text]
   [:miranda/narration
    "You make your way back to the hotel, and are immediately met by Zarya and Mei, who are packing protein powder and Adidas tracksuits for the both of you. After buying their expensive personal training package, you begin your workout regimen. You and Sombra do not have time to exchange words, and after the workout is over, you do not have the energy to do much but slink back into your rooms and fall asleep."
    :-> [:apartment2 :text]]

   [:apartment2 :text]
   [:miranda/narration
    "The following week is a blur of chalk flavored agony. When you finally arrive home, you sleep for 2 days straight in an attempt to revitalize your system for the upcoming matches. Once you wake up, you discover you have received a string of incoherent snapchats from Sombra, which seem to be chronicling the previous week."
    :-> [:apartment2 :text 2]]

   [:apartment2 :text 2]
   [:miranda/characters
    [[[:photos :_sombraDate1] [:phones :_symHand]]]
    :-> [:apartment2 :text 3]]

   [:apartment2 :text 3]
   [:miranda/dialogue
    ["Symmetra" [[:photos :_sombraDate1] [:phones :_symHand]]
     "Are these...bitcoin miners?"]
    :=> [:kings-row [:street :intro] 0]]})
