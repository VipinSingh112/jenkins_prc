/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevDisasterManagementAddException;
import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagementAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev disaster management add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagementAddUtil
 * @generated
 */
@ProviderType
public interface SezDevDisasterManagementAddPersistence
	extends BasePersistence<SezDevDisasterManagementAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevDisasterManagementAddUtil} to access the sez dev disaster management add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez dev disaster management adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev disaster management adds
	 */
	public java.util.List<SezDevDisasterManagementAdd>
		findBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez dev disaster management adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev disaster management adds
	 * @param end the upper bound of the range of sez dev disaster management adds (not inclusive)
	 * @return the range of matching sez dev disaster management adds
	 */
	public java.util.List<SezDevDisasterManagementAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez dev disaster management adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev disaster management adds
	 * @param end the upper bound of the range of sez dev disaster management adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev disaster management adds
	 */
	public java.util.List<SezDevDisasterManagementAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevDisasterManagementAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev disaster management adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev disaster management adds
	 * @param end the upper bound of the range of sez dev disaster management adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev disaster management adds
	 */
	public java.util.List<SezDevDisasterManagementAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevDisasterManagementAdd> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first sez dev disaster management add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev disaster management add
	 * @throws NoSuchSezDevDisasterManagementAddException if a matching sez dev disaster management add could not be found
	 */
	public SezDevDisasterManagementAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevDisasterManagementAdd> orderByComparator)
		throws NoSuchSezDevDisasterManagementAddException;

	/**
	 * Returns the first sez dev disaster management add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev disaster management add, or <code>null</code> if a matching sez dev disaster management add could not be found
	 */
	public SezDevDisasterManagementAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevDisasterManagementAdd> orderByComparator);

	/**
	 * Returns the last sez dev disaster management add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev disaster management add
	 * @throws NoSuchSezDevDisasterManagementAddException if a matching sez dev disaster management add could not be found
	 */
	public SezDevDisasterManagementAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevDisasterManagementAdd> orderByComparator)
		throws NoSuchSezDevDisasterManagementAddException;

	/**
	 * Returns the last sez dev disaster management add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev disaster management add, or <code>null</code> if a matching sez dev disaster management add could not be found
	 */
	public SezDevDisasterManagementAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevDisasterManagementAdd> orderByComparator);

	/**
	 * Returns the sez dev disaster management adds before and after the current sez dev disaster management add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevDisasterManagementAddId the primary key of the current sez dev disaster management add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev disaster management add
	 * @throws NoSuchSezDevDisasterManagementAddException if a sez dev disaster management add with the primary key could not be found
	 */
	public SezDevDisasterManagementAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevDisasterManagementAddId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevDisasterManagementAdd> orderByComparator)
		throws NoSuchSezDevDisasterManagementAddException;

	/**
	 * Removes all the sez dev disaster management adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez dev disaster management adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev disaster management adds
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev disaster management add in the entity cache if it is enabled.
	 *
	 * @param sezDevDisasterManagementAdd the sez dev disaster management add
	 */
	public void cacheResult(
		SezDevDisasterManagementAdd sezDevDisasterManagementAdd);

	/**
	 * Caches the sez dev disaster management adds in the entity cache if it is enabled.
	 *
	 * @param sezDevDisasterManagementAdds the sez dev disaster management adds
	 */
	public void cacheResult(
		java.util.List<SezDevDisasterManagementAdd>
			sezDevDisasterManagementAdds);

	/**
	 * Creates a new sez dev disaster management add with the primary key. Does not add the sez dev disaster management add to the database.
	 *
	 * @param sezDevDisasterManagementAddId the primary key for the new sez dev disaster management add
	 * @return the new sez dev disaster management add
	 */
	public SezDevDisasterManagementAdd create(
		long sezDevDisasterManagementAddId);

	/**
	 * Removes the sez dev disaster management add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevDisasterManagementAddId the primary key of the sez dev disaster management add
	 * @return the sez dev disaster management add that was removed
	 * @throws NoSuchSezDevDisasterManagementAddException if a sez dev disaster management add with the primary key could not be found
	 */
	public SezDevDisasterManagementAdd remove(
			long sezDevDisasterManagementAddId)
		throws NoSuchSezDevDisasterManagementAddException;

	public SezDevDisasterManagementAdd updateImpl(
		SezDevDisasterManagementAdd sezDevDisasterManagementAdd);

	/**
	 * Returns the sez dev disaster management add with the primary key or throws a <code>NoSuchSezDevDisasterManagementAddException</code> if it could not be found.
	 *
	 * @param sezDevDisasterManagementAddId the primary key of the sez dev disaster management add
	 * @return the sez dev disaster management add
	 * @throws NoSuchSezDevDisasterManagementAddException if a sez dev disaster management add with the primary key could not be found
	 */
	public SezDevDisasterManagementAdd findByPrimaryKey(
			long sezDevDisasterManagementAddId)
		throws NoSuchSezDevDisasterManagementAddException;

	/**
	 * Returns the sez dev disaster management add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevDisasterManagementAddId the primary key of the sez dev disaster management add
	 * @return the sez dev disaster management add, or <code>null</code> if a sez dev disaster management add with the primary key could not be found
	 */
	public SezDevDisasterManagementAdd fetchByPrimaryKey(
		long sezDevDisasterManagementAddId);

	/**
	 * Returns all the sez dev disaster management adds.
	 *
	 * @return the sez dev disaster management adds
	 */
	public java.util.List<SezDevDisasterManagementAdd> findAll();

	/**
	 * Returns a range of all the sez dev disaster management adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster management adds
	 * @param end the upper bound of the range of sez dev disaster management adds (not inclusive)
	 * @return the range of sez dev disaster management adds
	 */
	public java.util.List<SezDevDisasterManagementAdd> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez dev disaster management adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster management adds
	 * @param end the upper bound of the range of sez dev disaster management adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev disaster management adds
	 */
	public java.util.List<SezDevDisasterManagementAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevDisasterManagementAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev disaster management adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster management adds
	 * @param end the upper bound of the range of sez dev disaster management adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev disaster management adds
	 */
	public java.util.List<SezDevDisasterManagementAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevDisasterManagementAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev disaster management adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev disaster management adds.
	 *
	 * @return the number of sez dev disaster management adds
	 */
	public int countAll();

}