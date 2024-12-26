<template>
    <button 
      :class="['custom-button', buttonClass]" 
      @click="handleClick"
    >
      {{ buttonText }}
    </button>
  </template>
  
  <script>
  export default {
    name: 'CustomButton',
    props: {
      buttonText: {
        type: String,
        default: 'Click me'
      },
      buttonClass: {
        type: String,
        default: 'default-button'
      }
    },
    methods: {
      handleClick() {
        this.$emit('button-click')
      }
    }
  }
  </script>
  
  <style scoped>
  .custom-button {
    padding: 10px 15px;
    border-radius: 5px;
    cursor: pointer;
  }
  .default-button {
    background-color: #007bff;
    color: white;
  }
  </style>