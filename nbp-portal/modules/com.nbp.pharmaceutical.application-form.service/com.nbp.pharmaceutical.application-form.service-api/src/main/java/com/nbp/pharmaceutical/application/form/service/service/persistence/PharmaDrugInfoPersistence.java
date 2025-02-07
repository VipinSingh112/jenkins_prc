/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaDrugInfoException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma drug info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDrugInfoUtil
 * @generated
 */
@ProviderType
public interface PharmaDrugInfoPersistence
	extends BasePersistence<PharmaDrugInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaDrugInfoUtil} to access the pharma drug info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pharma drug info where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaDrugInfoException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a matching pharma drug info could not be found
	 */
	public PharmaDrugInfo findBygetPharmaByAppId(long pharmaApplicationId)
		throws NoSuchPharmaDrugInfoException;

	/**
	 * Returns the pharma drug info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma drug info, or <code>null</code> if a matching pharma drug info could not be found
	 */
	public PharmaDrugInfo fetchBygetPharmaByAppId(long pharmaApplicationId);

	/**
	 * Returns the pharma drug info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma drug info, or <code>null</code> if a matching pharma drug info could not be found
	 */
	public PharmaDrugInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId, boolean useFinderCache);

	/**
	 * Removes the pharma drug info where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma drug info that was removed
	 */
	public PharmaDrugInfo removeBygetPharmaByAppId(long pharmaApplicationId)
		throws NoSuchPharmaDrugInfoException;

	/**
	 * Returns the number of pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma drug infos
	 */
	public int countBygetPharmaByAppId(long pharmaApplicationId);

	/**
	 * Returns all the pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma drug infos
	 */
	public java.util.List<PharmaDrugInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId);

	/**
	 * Returns a range of all the pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @return the range of matching pharma drug infos
	 */
	public java.util.List<PharmaDrugInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma drug infos
	 */
	public java.util.List<PharmaDrugInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDrugInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma drug infos
	 */
	public java.util.List<PharmaDrugInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDrugInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a matching pharma drug info could not be found
	 */
	public PharmaDrugInfo findBygetPA_DI_PAI_First(
			long pharmaApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<PharmaDrugInfo>
				orderByComparator)
		throws NoSuchPharmaDrugInfoException;

	/**
	 * Returns the first pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma drug info, or <code>null</code> if a matching pharma drug info could not be found
	 */
	public PharmaDrugInfo fetchBygetPA_DI_PAI_First(
		long pharmaApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDrugInfo>
			orderByComparator);

	/**
	 * Returns the last pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a matching pharma drug info could not be found
	 */
	public PharmaDrugInfo findBygetPA_DI_PAI_Last(
			long pharmaApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<PharmaDrugInfo>
				orderByComparator)
		throws NoSuchPharmaDrugInfoException;

	/**
	 * Returns the last pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma drug info, or <code>null</code> if a matching pharma drug info could not be found
	 */
	public PharmaDrugInfo fetchBygetPA_DI_PAI_Last(
		long pharmaApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDrugInfo>
			orderByComparator);

	/**
	 * Returns the pharma drug infos before and after the current pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaDrugInfoId the primary key of the current pharma drug info
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a pharma drug info with the primary key could not be found
	 */
	public PharmaDrugInfo[] findBygetPA_DI_PAI_PrevAndNext(
			long pharmaDrugInfoId, long pharmaApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<PharmaDrugInfo>
				orderByComparator)
		throws NoSuchPharmaDrugInfoException;

	/**
	 * Removes all the pharma drug infos where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 */
	public void removeBygetPA_DI_PAI(long pharmaApplicationId);

	/**
	 * Returns the number of pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma drug infos
	 */
	public int countBygetPA_DI_PAI(long pharmaApplicationId);

	/**
	 * Caches the pharma drug info in the entity cache if it is enabled.
	 *
	 * @param pharmaDrugInfo the pharma drug info
	 */
	public void cacheResult(PharmaDrugInfo pharmaDrugInfo);

	/**
	 * Caches the pharma drug infos in the entity cache if it is enabled.
	 *
	 * @param pharmaDrugInfos the pharma drug infos
	 */
	public void cacheResult(java.util.List<PharmaDrugInfo> pharmaDrugInfos);

	/**
	 * Creates a new pharma drug info with the primary key. Does not add the pharma drug info to the database.
	 *
	 * @param pharmaDrugInfoId the primary key for the new pharma drug info
	 * @return the new pharma drug info
	 */
	public PharmaDrugInfo create(long pharmaDrugInfoId);

	/**
	 * Removes the pharma drug info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaDrugInfoId the primary key of the pharma drug info
	 * @return the pharma drug info that was removed
	 * @throws NoSuchPharmaDrugInfoException if a pharma drug info with the primary key could not be found
	 */
	public PharmaDrugInfo remove(long pharmaDrugInfoId)
		throws NoSuchPharmaDrugInfoException;

	public PharmaDrugInfo updateImpl(PharmaDrugInfo pharmaDrugInfo);

	/**
	 * Returns the pharma drug info with the primary key or throws a <code>NoSuchPharmaDrugInfoException</code> if it could not be found.
	 *
	 * @param pharmaDrugInfoId the primary key of the pharma drug info
	 * @return the pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a pharma drug info with the primary key could not be found
	 */
	public PharmaDrugInfo findByPrimaryKey(long pharmaDrugInfoId)
		throws NoSuchPharmaDrugInfoException;

	/**
	 * Returns the pharma drug info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaDrugInfoId the primary key of the pharma drug info
	 * @return the pharma drug info, or <code>null</code> if a pharma drug info with the primary key could not be found
	 */
	public PharmaDrugInfo fetchByPrimaryKey(long pharmaDrugInfoId);

	/**
	 * Returns all the pharma drug infos.
	 *
	 * @return the pharma drug infos
	 */
	public java.util.List<PharmaDrugInfo> findAll();

	/**
	 * Returns a range of all the pharma drug infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @return the range of pharma drug infos
	 */
	public java.util.List<PharmaDrugInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the pharma drug infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma drug infos
	 */
	public java.util.List<PharmaDrugInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDrugInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the pharma drug infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma drug infos
	 */
	public java.util.List<PharmaDrugInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDrugInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma drug infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma drug infos.
	 *
	 * @return the number of pharma drug infos
	 */
	public int countAll();

}