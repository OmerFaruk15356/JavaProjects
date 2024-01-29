public class Player {
    Gun gun = new Gun();
    public int healtPlayer;
    public boolean isTurn,isHasShield;

    public Player()
    {
        this.healtPlayer = 100;
    }

    public boolean isDead()
    {
        if(healtPlayer <= 0)
        {
            return true;
        }
        return false;
    }
    public void Reload()
    {
        gun.ammo++;
    }
    public void Shield()
    {
        isHasShield = true;
    }
    public void Shoot()
    {
        healtPlayer-= 20;
    }
}
