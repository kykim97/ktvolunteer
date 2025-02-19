<template>
    <div>
        <BasePicker v-if="editMode" searchApiPath="수혜기관정보s" searchParameterName=""  idField="" nameField="" path="수혜기관정보s" label="수혜기관정보id" v-model="value" @selected="pick" :editMode="editMode" />
        <div v-else style="height:100%">
            <span>{{ value && value.name ? value.name : '' }}</span>
        </div>
    </div>

</template>

<script>
import BaseEntity from './base-ui/BaseEntity.vue'
import BasePicker from './base-ui/BasePicker.vue'

export default {
    name: '수혜기관정보id',
    mixins:[BaseEntity],
    components:{
        BasePicker
    },
    data: () => ({
        path: '수혜기관정보s',
    }),
    props: {
    },
    watch: {
        value(val){
            this.value = val;
            this.change();
        },
    },
    async created(){
        this.value = this.modelValue
        if (this.value && this.value.id !== undefined) {
            this.value = await this.repository.findById(this.value.id)
        }
    },
    methods: {
        pick(val){
            this.value = val;
            this.change();
        },
    }
}
</script>

