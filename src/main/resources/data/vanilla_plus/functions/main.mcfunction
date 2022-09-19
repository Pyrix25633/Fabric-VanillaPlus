# Mainhand totem tag add and remove
tag @a[tag=!mainhandTotem, nbt={SelectedItem:{id:"minecraft:totem_of_undying"}}] add mainhandTotem
tag @a[tag=mainhandTotem, nbt=!{SelectedItem:{id:"minecraft:totem_of_undying"}}] remove mainhandTotem

# Mob totem tag add
function vanilla_plus:add_tag

# Effects applying
function vanilla_plus:give_effects

scoreboard players set @a[scores={usedTotem=1}] usedTotem 0

# Mob totem remove
function vanilla_plus:remove_tag