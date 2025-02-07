/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevEmployeeDefineOccuAddException;
import com.nbp.sez.status.application.form.service.model.SezDevEmployeeDefineOccuAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev employee define occu add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmployeeDefineOccuAddUtil
 * @generated
 */
@ProviderType
public interface SezDevEmployeeDefineOccuAddPersistence
	extends BasePersistence<SezDevEmployeeDefineOccuAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevEmployeeDefineOccuAddUtil} to access the sez dev employee define occu add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev employee define occu adds
	 */
	public java.util.List<SezDevEmployeeDefineOccuAdd>
		findBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @return the range of matching sez dev employee define occu adds
	 */
	public java.util.List<SezDevEmployeeDefineOccuAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev employee define occu adds
	 */
	public java.util.List<SezDevEmployeeDefineOccuAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevEmployeeDefineOccuAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev employee define occu adds
	 */
	public java.util.List<SezDevEmployeeDefineOccuAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevEmployeeDefineOccuAdd> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev employee define occu add
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a matching sez dev employee define occu add could not be found
	 */
	public SezDevEmployeeDefineOccuAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevEmployeeDefineOccuAdd> orderByComparator)
		throws NoSuchSezDevEmployeeDefineOccuAddException;

	/**
	 * Returns the first sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev employee define occu add, or <code>null</code> if a matching sez dev employee define occu add could not be found
	 */
	public SezDevEmployeeDefineOccuAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevEmployeeDefineOccuAdd> orderByComparator);

	/**
	 * Returns the last sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev employee define occu add
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a matching sez dev employee define occu add could not be found
	 */
	public SezDevEmployeeDefineOccuAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevEmployeeDefineOccuAdd> orderByComparator)
		throws NoSuchSezDevEmployeeDefineOccuAddException;

	/**
	 * Returns the last sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev employee define occu add, or <code>null</code> if a matching sez dev employee define occu add could not be found
	 */
	public SezDevEmployeeDefineOccuAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevEmployeeDefineOccuAdd> orderByComparator);

	/**
	 * Returns the sez dev employee define occu adds before and after the current sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the current sez dev employee define occu add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev employee define occu add
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a sez dev employee define occu add with the primary key could not be found
	 */
	public SezDevEmployeeDefineOccuAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevEmployeeDefineOccuAddId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevEmployeeDefineOccuAdd> orderByComparator)
		throws NoSuchSezDevEmployeeDefineOccuAddException;

	/**
	 * Removes all the sez dev employee define occu adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev employee define occu adds
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev employee define occu add in the entity cache if it is enabled.
	 *
	 * @param sezDevEmployeeDefineOccuAdd the sez dev employee define occu add
	 */
	public void cacheResult(
		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd);

	/**
	 * Caches the sez dev employee define occu adds in the entity cache if it is enabled.
	 *
	 * @param sezDevEmployeeDefineOccuAdds the sez dev employee define occu adds
	 */
	public void cacheResult(
		java.util.List<SezDevEmployeeDefineOccuAdd>
			sezDevEmployeeDefineOccuAdds);

	/**
	 * Creates a new sez dev employee define occu add with the primary key. Does not add the sez dev employee define occu add to the database.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key for the new sez dev employee define occu add
	 * @return the new sez dev employee define occu add
	 */
	public SezDevEmployeeDefineOccuAdd create(
		long sezDevEmployeeDefineOccuAddId);

	/**
	 * Removes the sez dev employee define occu add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the sez dev employee define occu add
	 * @return the sez dev employee define occu add that was removed
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a sez dev employee define occu add with the primary key could not be found
	 */
	public SezDevEmployeeDefineOccuAdd remove(
			long sezDevEmployeeDefineOccuAddId)
		throws NoSuchSezDevEmployeeDefineOccuAddException;

	public SezDevEmployeeDefineOccuAdd updateImpl(
		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd);

	/**
	 * Returns the sez dev employee define occu add with the primary key or throws a <code>NoSuchSezDevEmployeeDefineOccuAddException</code> if it could not be found.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the sez dev employee define occu add
	 * @return the sez dev employee define occu add
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a sez dev employee define occu add with the primary key could not be found
	 */
	public SezDevEmployeeDefineOccuAdd findByPrimaryKey(
			long sezDevEmployeeDefineOccuAddId)
		throws NoSuchSezDevEmployeeDefineOccuAddException;

	/**
	 * Returns the sez dev employee define occu add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the sez dev employee define occu add
	 * @return the sez dev employee define occu add, or <code>null</code> if a sez dev employee define occu add with the primary key could not be found
	 */
	public SezDevEmployeeDefineOccuAdd fetchByPrimaryKey(
		long sezDevEmployeeDefineOccuAddId);

	/**
	 * Returns all the sez dev employee define occu adds.
	 *
	 * @return the sez dev employee define occu adds
	 */
	public java.util.List<SezDevEmployeeDefineOccuAdd> findAll();

	/**
	 * Returns a range of all the sez dev employee define occu adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @return the range of sez dev employee define occu adds
	 */
	public java.util.List<SezDevEmployeeDefineOccuAdd> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez dev employee define occu adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev employee define occu adds
	 */
	public java.util.List<SezDevEmployeeDefineOccuAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevEmployeeDefineOccuAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev employee define occu adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev employee define occu adds
	 */
	public java.util.List<SezDevEmployeeDefineOccuAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevEmployeeDefineOccuAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev employee define occu adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev employee define occu adds.
	 *
	 * @return the number of sez dev employee define occu adds
	 */
	public int countAll();

}