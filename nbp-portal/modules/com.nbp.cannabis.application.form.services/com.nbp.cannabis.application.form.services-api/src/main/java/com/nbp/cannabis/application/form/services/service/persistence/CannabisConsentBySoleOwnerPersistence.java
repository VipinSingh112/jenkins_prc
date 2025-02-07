/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisConsentBySoleOwnerException;
import com.nbp.cannabis.application.form.services.model.CannabisConsentBySoleOwner;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis consent by sole owner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentBySoleOwnerUtil
 * @generated
 */
@ProviderType
public interface CannabisConsentBySoleOwnerPersistence
	extends BasePersistence<CannabisConsentBySoleOwner> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisConsentBySoleOwnerUtil} to access the cannabis consent by sole owner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis consent by sole owners
	 */
	public java.util.List<CannabisConsentBySoleOwner> findBygetCA_CSO_BY_CAI(
		long cannabisApplicationId);

	/**
	 * Returns a range of all the cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @return the range of matching cannabis consent by sole owners
	 */
	public java.util.List<CannabisConsentBySoleOwner> findBygetCA_CSO_BY_CAI(
		long cannabisApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis consent by sole owners
	 */
	public java.util.List<CannabisConsentBySoleOwner> findBygetCA_CSO_BY_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentBySoleOwner> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis consent by sole owners
	 */
	public java.util.List<CannabisConsentBySoleOwner> findBygetCA_CSO_BY_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentBySoleOwner> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by sole owner
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a matching cannabis consent by sole owner could not be found
	 */
	public CannabisConsentBySoleOwner findBygetCA_CSO_BY_CAI_First(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConsentBySoleOwner> orderByComparator)
		throws NoSuchCannabisConsentBySoleOwnerException;

	/**
	 * Returns the first cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by sole owner, or <code>null</code> if a matching cannabis consent by sole owner could not be found
	 */
	public CannabisConsentBySoleOwner fetchBygetCA_CSO_BY_CAI_First(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentBySoleOwner> orderByComparator);

	/**
	 * Returns the last cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by sole owner
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a matching cannabis consent by sole owner could not be found
	 */
	public CannabisConsentBySoleOwner findBygetCA_CSO_BY_CAI_Last(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConsentBySoleOwner> orderByComparator)
		throws NoSuchCannabisConsentBySoleOwnerException;

	/**
	 * Returns the last cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by sole owner, or <code>null</code> if a matching cannabis consent by sole owner could not be found
	 */
	public CannabisConsentBySoleOwner fetchBygetCA_CSO_BY_CAI_Last(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentBySoleOwner> orderByComparator);

	/**
	 * Returns the cannabis consent by sole owners before and after the current cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the current cannabis consent by sole owner
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis consent by sole owner
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a cannabis consent by sole owner with the primary key could not be found
	 */
	public CannabisConsentBySoleOwner[] findBygetCA_CSO_BY_CAI_PrevAndNext(
			long cannabisConsentBySoleOwnerId, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConsentBySoleOwner> orderByComparator)
		throws NoSuchCannabisConsentBySoleOwnerException;

	/**
	 * Removes all the cannabis consent by sole owners where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetCA_CSO_BY_CAI(long cannabisApplicationId);

	/**
	 * Returns the number of cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis consent by sole owners
	 */
	public int countBygetCA_CSO_BY_CAI(long cannabisApplicationId);

	/**
	 * Caches the cannabis consent by sole owner in the entity cache if it is enabled.
	 *
	 * @param cannabisConsentBySoleOwner the cannabis consent by sole owner
	 */
	public void cacheResult(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner);

	/**
	 * Caches the cannabis consent by sole owners in the entity cache if it is enabled.
	 *
	 * @param cannabisConsentBySoleOwners the cannabis consent by sole owners
	 */
	public void cacheResult(
		java.util.List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners);

	/**
	 * Creates a new cannabis consent by sole owner with the primary key. Does not add the cannabis consent by sole owner to the database.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key for the new cannabis consent by sole owner
	 * @return the new cannabis consent by sole owner
	 */
	public CannabisConsentBySoleOwner create(long cannabisConsentBySoleOwnerId);

	/**
	 * Removes the cannabis consent by sole owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner that was removed
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a cannabis consent by sole owner with the primary key could not be found
	 */
	public CannabisConsentBySoleOwner remove(long cannabisConsentBySoleOwnerId)
		throws NoSuchCannabisConsentBySoleOwnerException;

	public CannabisConsentBySoleOwner updateImpl(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner);

	/**
	 * Returns the cannabis consent by sole owner with the primary key or throws a <code>NoSuchCannabisConsentBySoleOwnerException</code> if it could not be found.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a cannabis consent by sole owner with the primary key could not be found
	 */
	public CannabisConsentBySoleOwner findByPrimaryKey(
			long cannabisConsentBySoleOwnerId)
		throws NoSuchCannabisConsentBySoleOwnerException;

	/**
	 * Returns the cannabis consent by sole owner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner, or <code>null</code> if a cannabis consent by sole owner with the primary key could not be found
	 */
	public CannabisConsentBySoleOwner fetchByPrimaryKey(
		long cannabisConsentBySoleOwnerId);

	/**
	 * Returns all the cannabis consent by sole owners.
	 *
	 * @return the cannabis consent by sole owners
	 */
	public java.util.List<CannabisConsentBySoleOwner> findAll();

	/**
	 * Returns a range of all the cannabis consent by sole owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @return the range of cannabis consent by sole owners
	 */
	public java.util.List<CannabisConsentBySoleOwner> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis consent by sole owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis consent by sole owners
	 */
	public java.util.List<CannabisConsentBySoleOwner> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentBySoleOwner> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis consent by sole owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis consent by sole owners
	 */
	public java.util.List<CannabisConsentBySoleOwner> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentBySoleOwner> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis consent by sole owners from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis consent by sole owners.
	 *
	 * @return the number of cannabis consent by sole owners
	 */
	public int countAll();

}