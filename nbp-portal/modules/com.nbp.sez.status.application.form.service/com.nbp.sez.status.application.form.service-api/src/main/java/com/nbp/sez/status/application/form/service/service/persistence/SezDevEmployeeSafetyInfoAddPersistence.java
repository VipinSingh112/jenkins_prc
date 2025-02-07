/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevEmployeeSafetyInfoAddException;
import com.nbp.sez.status.application.form.service.model.SezDevEmployeeSafetyInfoAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev employee safety info add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmployeeSafetyInfoAddUtil
 * @generated
 */
@ProviderType
public interface SezDevEmployeeSafetyInfoAddPersistence
	extends BasePersistence<SezDevEmployeeSafetyInfoAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevEmployeeSafetyInfoAddUtil} to access the sez dev employee safety info add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev employee safety info adds
	 */
	public java.util.List<SezDevEmployeeSafetyInfoAdd>
		findBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @return the range of matching sez dev employee safety info adds
	 */
	public java.util.List<SezDevEmployeeSafetyInfoAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev employee safety info adds
	 */
	public java.util.List<SezDevEmployeeSafetyInfoAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevEmployeeSafetyInfoAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev employee safety info adds
	 */
	public java.util.List<SezDevEmployeeSafetyInfoAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevEmployeeSafetyInfoAdd> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev employee safety info add
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a matching sez dev employee safety info add could not be found
	 */
	public SezDevEmployeeSafetyInfoAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevEmployeeSafetyInfoAdd> orderByComparator)
		throws NoSuchSezDevEmployeeSafetyInfoAddException;

	/**
	 * Returns the first sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev employee safety info add, or <code>null</code> if a matching sez dev employee safety info add could not be found
	 */
	public SezDevEmployeeSafetyInfoAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevEmployeeSafetyInfoAdd> orderByComparator);

	/**
	 * Returns the last sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev employee safety info add
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a matching sez dev employee safety info add could not be found
	 */
	public SezDevEmployeeSafetyInfoAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevEmployeeSafetyInfoAdd> orderByComparator)
		throws NoSuchSezDevEmployeeSafetyInfoAddException;

	/**
	 * Returns the last sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev employee safety info add, or <code>null</code> if a matching sez dev employee safety info add could not be found
	 */
	public SezDevEmployeeSafetyInfoAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevEmployeeSafetyInfoAdd> orderByComparator);

	/**
	 * Returns the sez dev employee safety info adds before and after the current sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the current sez dev employee safety info add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev employee safety info add
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a sez dev employee safety info add with the primary key could not be found
	 */
	public SezDevEmployeeSafetyInfoAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevEmployeeSafetyInfoAddId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevEmployeeSafetyInfoAdd> orderByComparator)
		throws NoSuchSezDevEmployeeSafetyInfoAddException;

	/**
	 * Removes all the sez dev employee safety info adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev employee safety info adds
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev employee safety info add in the entity cache if it is enabled.
	 *
	 * @param sezDevEmployeeSafetyInfoAdd the sez dev employee safety info add
	 */
	public void cacheResult(
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd);

	/**
	 * Caches the sez dev employee safety info adds in the entity cache if it is enabled.
	 *
	 * @param sezDevEmployeeSafetyInfoAdds the sez dev employee safety info adds
	 */
	public void cacheResult(
		java.util.List<SezDevEmployeeSafetyInfoAdd>
			sezDevEmployeeSafetyInfoAdds);

	/**
	 * Creates a new sez dev employee safety info add with the primary key. Does not add the sez dev employee safety info add to the database.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key for the new sez dev employee safety info add
	 * @return the new sez dev employee safety info add
	 */
	public SezDevEmployeeSafetyInfoAdd create(
		long sezDevEmployeeSafetyInfoAddId);

	/**
	 * Removes the sez dev employee safety info add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add that was removed
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a sez dev employee safety info add with the primary key could not be found
	 */
	public SezDevEmployeeSafetyInfoAdd remove(
			long sezDevEmployeeSafetyInfoAddId)
		throws NoSuchSezDevEmployeeSafetyInfoAddException;

	public SezDevEmployeeSafetyInfoAdd updateImpl(
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd);

	/**
	 * Returns the sez dev employee safety info add with the primary key or throws a <code>NoSuchSezDevEmployeeSafetyInfoAddException</code> if it could not be found.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a sez dev employee safety info add with the primary key could not be found
	 */
	public SezDevEmployeeSafetyInfoAdd findByPrimaryKey(
			long sezDevEmployeeSafetyInfoAddId)
		throws NoSuchSezDevEmployeeSafetyInfoAddException;

	/**
	 * Returns the sez dev employee safety info add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add, or <code>null</code> if a sez dev employee safety info add with the primary key could not be found
	 */
	public SezDevEmployeeSafetyInfoAdd fetchByPrimaryKey(
		long sezDevEmployeeSafetyInfoAddId);

	/**
	 * Returns all the sez dev employee safety info adds.
	 *
	 * @return the sez dev employee safety info adds
	 */
	public java.util.List<SezDevEmployeeSafetyInfoAdd> findAll();

	/**
	 * Returns a range of all the sez dev employee safety info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @return the range of sez dev employee safety info adds
	 */
	public java.util.List<SezDevEmployeeSafetyInfoAdd> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez dev employee safety info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev employee safety info adds
	 */
	public java.util.List<SezDevEmployeeSafetyInfoAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevEmployeeSafetyInfoAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev employee safety info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev employee safety info adds
	 */
	public java.util.List<SezDevEmployeeSafetyInfoAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevEmployeeSafetyInfoAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev employee safety info adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev employee safety info adds.
	 *
	 * @return the number of sez dev employee safety info adds
	 */
	public int countAll();

}