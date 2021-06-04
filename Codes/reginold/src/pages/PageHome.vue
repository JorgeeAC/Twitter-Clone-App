<template>
  <q-page >
    <div class = "q-py-lg q-px-md row items-end
    q-col-gutter-md">
      <div class = "col">
         <q-input 
        bottom-slots 
        v-model="newReginoldContent" 
        class = "new-reginold"
        placeholder="What's going on?" 
        maxlength="258" 
        counter
        autogrow
        >
        <template v-slot:before>
          <q-avatar size = "xl" >
            <img src="https://cdn.quasar.dev/img/avatar5.jpg">
          </q-avatar>
        </template>


       
      </q-input>


      </div>
      <div class = "col col-shrink"> 
        <q-btn
           :disable = "!newReginoldContent"
           class = "q-mb-lg"
           unelevated rounded 
           color="primary" 
           label="Twoot" 
           no-caps
           
           />   


      </div>
       
    </div>


    <q-separator 
      class = "divider"
      size="10px" 
      color ="grey-2"

    />
     <q-list>
       <q-item 
       v-for="twoot in twoots"
       :key = "twoot.date"
       class = "q-py-md"
       >
        <q-item-section avatar top>
          <q-avatar>
            <img src="https://cdn.quasar.dev/img/avatar2.jpg">
          </q-avatar>
        </q-item-section>

        <q-item-section>
          <q-item-label class = "text-subtitle1">
             <strong>Kanye West</strong>
             <span class="text-grey-7"> 
               @Kanye
             </span>
          </q-item-label>
          <q-item-label class = "twoot-content" text-body1>
            {{twoot.content}} 
            </q-item-label>

            <div class="twoot-icons row justify-between q-mt-sm">
              <q-btn 
                flat 
                round 
                color = "grey"
                icon = "far fa-comment" 
                size = "sm"
              />
              <q-btn 
                flat 
                round 
                color = "grey"
                icon = "fas fa-retweet" 
                size = "sm"
              />
              <q-btn 
                flat 
                round 
                color = "grey"
                icon = "far fa-heart" 
                size = "sm"
              />
              <q-btn 
                flat 
                round 
                color = "grey"
                icon = "fas fa-trash" 
                size = "sm"
              />

            </div>
        </q-item-section>

        <q-item-section side top>
          {{twoot.date | relativeDate}}
        </q-item-section>
      </q-item>


    </q-list>
  </q-page>
  

     
</template>

<script>

import { formatDistance } from 'date-fns'

export default {
  name: 'PageHome',
  data() {
    return {
      newReginoldContent: '',
      twoots: [
        {
          content: 'something',
          date: 1611653238221
        },
        {
          content: 'something pt 2',
          date: 1611653252444
        },

      ]}

  },
  filters: {
    relativeDate(value)
    {
      return formatDistance(subDays(value, new Date()))

    }
  }
}
</script>

<style lang="sass">
.new-reginold
  textarea
    font-size: 19 px
    line-height: 1.4 !important
  
.divider
  border-top: 1px solid 
  border-bottom: 1px solid
  border-color: $grey-4
.twoot-content
  white-space: pre-line
.twoot-icons
  margin-left: -5px
</style>