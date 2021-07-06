<template>
  <div class="mission">
    현재 수정 중 입니다.
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: 'Mission',
  created() {
    localStorage.setItem("select", 3)
  },
}
</script>
