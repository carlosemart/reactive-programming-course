Сгенерируйте `Publisher` который возвращает данное значение `value` в случае `value` находиться в границах `[min, max]`.
В случае если `value` выходит за границы приделов - верните `Publisher` с ошибкой
   
<div class="hint">
  Используйте Flux.just в комбинации с Flux.error
</div>