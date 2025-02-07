/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantPrincipleDirectorException;
import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleDirector;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez occupant principle director service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantPrincipleDirectorUtil
 * @generated
 */
@ProviderType
public interface SezOccupantPrincipleDirectorPersistence
	extends BasePersistence<SezOccupantPrincipleDirector> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezOccupantPrincipleDirectorUtil} to access the sez occupant principle director persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant principle directors
	 */
	public java.util.List<SezOccupantPrincipleDirector>
		findBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @return the range of matching sez occupant principle directors
	 */
	public java.util.List<SezOccupantPrincipleDirector>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant principle directors
	 */
	public java.util.List<SezOccupantPrincipleDirector>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantPrincipleDirector> orderByComparator);

	/**
	 * Returns an ordered range of all the sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant principle directors
	 */
	public java.util.List<SezOccupantPrincipleDirector>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantPrincipleDirector> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant principle director
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a matching sez occupant principle director could not be found
	 */
	public SezOccupantPrincipleDirector findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantPrincipleDirector> orderByComparator)
		throws NoSuchSezOccupantPrincipleDirectorException;

	/**
	 * Returns the first sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant principle director, or <code>null</code> if a matching sez occupant principle director could not be found
	 */
	public SezOccupantPrincipleDirector fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantPrincipleDirector> orderByComparator);

	/**
	 * Returns the last sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant principle director
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a matching sez occupant principle director could not be found
	 */
	public SezOccupantPrincipleDirector findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantPrincipleDirector> orderByComparator)
		throws NoSuchSezOccupantPrincipleDirectorException;

	/**
	 * Returns the last sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant principle director, or <code>null</code> if a matching sez occupant principle director could not be found
	 */
	public SezOccupantPrincipleDirector fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantPrincipleDirector> orderByComparator);

	/**
	 * Returns the sez occupant principle directors before and after the current sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccPrincDirectId the primary key of the current sez occupant principle director
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant principle director
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a sez occupant principle director with the primary key could not be found
	 */
	public SezOccupantPrincipleDirector[] findBygetSezStatusByAppId_PrevAndNext(
			long sezOccPrincDirectId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantPrincipleDirector> orderByComparator)
		throws NoSuchSezOccupantPrincipleDirectorException;

	/**
	 * Removes all the sez occupant principle directors where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant principle directors
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez occupant principle director in the entity cache if it is enabled.
	 *
	 * @param sezOccupantPrincipleDirector the sez occupant principle director
	 */
	public void cacheResult(
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector);

	/**
	 * Caches the sez occupant principle directors in the entity cache if it is enabled.
	 *
	 * @param sezOccupantPrincipleDirectors the sez occupant principle directors
	 */
	public void cacheResult(
		java.util.List<SezOccupantPrincipleDirector>
			sezOccupantPrincipleDirectors);

	/**
	 * Creates a new sez occupant principle director with the primary key. Does not add the sez occupant principle director to the database.
	 *
	 * @param sezOccPrincDirectId the primary key for the new sez occupant principle director
	 * @return the new sez occupant principle director
	 */
	public SezOccupantPrincipleDirector create(long sezOccPrincDirectId);

	/**
	 * Removes the sez occupant principle director with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccPrincDirectId the primary key of the sez occupant principle director
	 * @return the sez occupant principle director that was removed
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a sez occupant principle director with the primary key could not be found
	 */
	public SezOccupantPrincipleDirector remove(long sezOccPrincDirectId)
		throws NoSuchSezOccupantPrincipleDirectorException;

	public SezOccupantPrincipleDirector updateImpl(
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector);

	/**
	 * Returns the sez occupant principle director with the primary key or throws a <code>NoSuchSezOccupantPrincipleDirectorException</code> if it could not be found.
	 *
	 * @param sezOccPrincDirectId the primary key of the sez occupant principle director
	 * @return the sez occupant principle director
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a sez occupant principle director with the primary key could not be found
	 */
	public SezOccupantPrincipleDirector findByPrimaryKey(
			long sezOccPrincDirectId)
		throws NoSuchSezOccupantPrincipleDirectorException;

	/**
	 * Returns the sez occupant principle director with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccPrincDirectId the primary key of the sez occupant principle director
	 * @return the sez occupant principle director, or <code>null</code> if a sez occupant principle director with the primary key could not be found
	 */
	public SezOccupantPrincipleDirector fetchByPrimaryKey(
		long sezOccPrincDirectId);

	/**
	 * Returns all the sez occupant principle directors.
	 *
	 * @return the sez occupant principle directors
	 */
	public java.util.List<SezOccupantPrincipleDirector> findAll();

	/**
	 * Returns a range of all the sez occupant principle directors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @return the range of sez occupant principle directors
	 */
	public java.util.List<SezOccupantPrincipleDirector> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez occupant principle directors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant principle directors
	 */
	public java.util.List<SezOccupantPrincipleDirector> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantPrincipleDirector> orderByComparator);

	/**
	 * Returns an ordered range of all the sez occupant principle directors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant principle directors
	 */
	public java.util.List<SezOccupantPrincipleDirector> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantPrincipleDirector> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez occupant principle directors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez occupant principle directors.
	 *
	 * @return the number of sez occupant principle directors
	 */
	public int countAll();

}