/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.film.stages.services.exception.NoSuchFilmApplicationRegisterException;
import com.nbp.film.stages.services.model.FilmApplicationRegister;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the film application register service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationRegisterUtil
 * @generated
 */
@ProviderType
public interface FilmApplicationRegisterPersistence
	extends BasePersistence<FilmApplicationRegister> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilmApplicationRegisterUtil} to access the film application register persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the film application register where caseId = &#63; or throws a <code>NoSuchFilmApplicationRegisterException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching film application register
	 * @throws NoSuchFilmApplicationRegisterException if a matching film application register could not be found
	 */
	public FilmApplicationRegister findBygetFilmByCI(String caseId)
		throws NoSuchFilmApplicationRegisterException;

	/**
	 * Returns the film application register where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching film application register, or <code>null</code> if a matching film application register could not be found
	 */
	public FilmApplicationRegister fetchBygetFilmByCI(String caseId);

	/**
	 * Returns the film application register where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application register, or <code>null</code> if a matching film application register could not be found
	 */
	public FilmApplicationRegister fetchBygetFilmByCI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the film application register where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the film application register that was removed
	 */
	public FilmApplicationRegister removeBygetFilmByCI(String caseId)
		throws NoSuchFilmApplicationRegisterException;

	/**
	 * Returns the number of film application registers where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film application registers
	 */
	public int countBygetFilmByCI(String caseId);

	/**
	 * Caches the film application register in the entity cache if it is enabled.
	 *
	 * @param filmApplicationRegister the film application register
	 */
	public void cacheResult(FilmApplicationRegister filmApplicationRegister);

	/**
	 * Caches the film application registers in the entity cache if it is enabled.
	 *
	 * @param filmApplicationRegisters the film application registers
	 */
	public void cacheResult(
		java.util.List<FilmApplicationRegister> filmApplicationRegisters);

	/**
	 * Creates a new film application register with the primary key. Does not add the film application register to the database.
	 *
	 * @param filmApplicationRegisterId the primary key for the new film application register
	 * @return the new film application register
	 */
	public FilmApplicationRegister create(long filmApplicationRegisterId);

	/**
	 * Removes the film application register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationRegisterId the primary key of the film application register
	 * @return the film application register that was removed
	 * @throws NoSuchFilmApplicationRegisterException if a film application register with the primary key could not be found
	 */
	public FilmApplicationRegister remove(long filmApplicationRegisterId)
		throws NoSuchFilmApplicationRegisterException;

	public FilmApplicationRegister updateImpl(
		FilmApplicationRegister filmApplicationRegister);

	/**
	 * Returns the film application register with the primary key or throws a <code>NoSuchFilmApplicationRegisterException</code> if it could not be found.
	 *
	 * @param filmApplicationRegisterId the primary key of the film application register
	 * @return the film application register
	 * @throws NoSuchFilmApplicationRegisterException if a film application register with the primary key could not be found
	 */
	public FilmApplicationRegister findByPrimaryKey(
			long filmApplicationRegisterId)
		throws NoSuchFilmApplicationRegisterException;

	/**
	 * Returns the film application register with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationRegisterId the primary key of the film application register
	 * @return the film application register, or <code>null</code> if a film application register with the primary key could not be found
	 */
	public FilmApplicationRegister fetchByPrimaryKey(
		long filmApplicationRegisterId);

	/**
	 * Returns all the film application registers.
	 *
	 * @return the film application registers
	 */
	public java.util.List<FilmApplicationRegister> findAll();

	/**
	 * Returns a range of all the film application registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationRegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application registers
	 * @param end the upper bound of the range of film application registers (not inclusive)
	 * @return the range of film application registers
	 */
	public java.util.List<FilmApplicationRegister> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the film application registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationRegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application registers
	 * @param end the upper bound of the range of film application registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film application registers
	 */
	public java.util.List<FilmApplicationRegister> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FilmApplicationRegister> orderByComparator);

	/**
	 * Returns an ordered range of all the film application registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationRegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application registers
	 * @param end the upper bound of the range of film application registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film application registers
	 */
	public java.util.List<FilmApplicationRegister> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FilmApplicationRegister> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the film application registers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of film application registers.
	 *
	 * @return the number of film application registers
	 */
	public int countAll();

}