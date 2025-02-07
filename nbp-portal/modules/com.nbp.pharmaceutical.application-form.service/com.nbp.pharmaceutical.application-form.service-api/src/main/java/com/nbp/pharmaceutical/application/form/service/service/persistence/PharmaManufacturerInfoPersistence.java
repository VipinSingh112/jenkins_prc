/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaManufacturerInfoException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaManufacturerInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma manufacturer info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaManufacturerInfoUtil
 * @generated
 */
@ProviderType
public interface PharmaManufacturerInfoPersistence
	extends BasePersistence<PharmaManufacturerInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaManufacturerInfoUtil} to access the pharma manufacturer info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pharma manufacturer info where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaManufacturerInfoException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a matching pharma manufacturer info could not be found
	 */
	public PharmaManufacturerInfo findBygetPharmaByAppId(
			long pharmaApplicationId)
		throws NoSuchPharmaManufacturerInfoException;

	/**
	 * Returns the pharma manufacturer info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma manufacturer info, or <code>null</code> if a matching pharma manufacturer info could not be found
	 */
	public PharmaManufacturerInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId);

	/**
	 * Returns the pharma manufacturer info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma manufacturer info, or <code>null</code> if a matching pharma manufacturer info could not be found
	 */
	public PharmaManufacturerInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId, boolean useFinderCache);

	/**
	 * Removes the pharma manufacturer info where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma manufacturer info that was removed
	 */
	public PharmaManufacturerInfo removeBygetPharmaByAppId(
			long pharmaApplicationId)
		throws NoSuchPharmaManufacturerInfoException;

	/**
	 * Returns the number of pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma manufacturer infos
	 */
	public int countBygetPharmaByAppId(long pharmaApplicationId);

	/**
	 * Returns all the pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma manufacturer infos
	 */
	public java.util.List<PharmaManufacturerInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId);

	/**
	 * Returns a range of all the pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @return the range of matching pharma manufacturer infos
	 */
	public java.util.List<PharmaManufacturerInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma manufacturer infos
	 */
	public java.util.List<PharmaManufacturerInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaManufacturerInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma manufacturer infos
	 */
	public java.util.List<PharmaManufacturerInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaManufacturerInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a matching pharma manufacturer info could not be found
	 */
	public PharmaManufacturerInfo findBygetPA_DI_PAI_First(
			long pharmaApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaManufacturerInfo> orderByComparator)
		throws NoSuchPharmaManufacturerInfoException;

	/**
	 * Returns the first pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma manufacturer info, or <code>null</code> if a matching pharma manufacturer info could not be found
	 */
	public PharmaManufacturerInfo fetchBygetPA_DI_PAI_First(
		long pharmaApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaManufacturerInfo>
			orderByComparator);

	/**
	 * Returns the last pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a matching pharma manufacturer info could not be found
	 */
	public PharmaManufacturerInfo findBygetPA_DI_PAI_Last(
			long pharmaApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaManufacturerInfo> orderByComparator)
		throws NoSuchPharmaManufacturerInfoException;

	/**
	 * Returns the last pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma manufacturer info, or <code>null</code> if a matching pharma manufacturer info could not be found
	 */
	public PharmaManufacturerInfo fetchBygetPA_DI_PAI_Last(
		long pharmaApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaManufacturerInfo>
			orderByComparator);

	/**
	 * Returns the pharma manufacturer infos before and after the current pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaManufacturerInfoId the primary key of the current pharma manufacturer info
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a pharma manufacturer info with the primary key could not be found
	 */
	public PharmaManufacturerInfo[] findBygetPA_DI_PAI_PrevAndNext(
			long pharmaManufacturerInfoId, long pharmaApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaManufacturerInfo> orderByComparator)
		throws NoSuchPharmaManufacturerInfoException;

	/**
	 * Removes all the pharma manufacturer infos where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 */
	public void removeBygetPA_DI_PAI(long pharmaApplicationId);

	/**
	 * Returns the number of pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma manufacturer infos
	 */
	public int countBygetPA_DI_PAI(long pharmaApplicationId);

	/**
	 * Caches the pharma manufacturer info in the entity cache if it is enabled.
	 *
	 * @param pharmaManufacturerInfo the pharma manufacturer info
	 */
	public void cacheResult(PharmaManufacturerInfo pharmaManufacturerInfo);

	/**
	 * Caches the pharma manufacturer infos in the entity cache if it is enabled.
	 *
	 * @param pharmaManufacturerInfos the pharma manufacturer infos
	 */
	public void cacheResult(
		java.util.List<PharmaManufacturerInfo> pharmaManufacturerInfos);

	/**
	 * Creates a new pharma manufacturer info with the primary key. Does not add the pharma manufacturer info to the database.
	 *
	 * @param pharmaManufacturerInfoId the primary key for the new pharma manufacturer info
	 * @return the new pharma manufacturer info
	 */
	public PharmaManufacturerInfo create(long pharmaManufacturerInfoId);

	/**
	 * Removes the pharma manufacturer info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaManufacturerInfoId the primary key of the pharma manufacturer info
	 * @return the pharma manufacturer info that was removed
	 * @throws NoSuchPharmaManufacturerInfoException if a pharma manufacturer info with the primary key could not be found
	 */
	public PharmaManufacturerInfo remove(long pharmaManufacturerInfoId)
		throws NoSuchPharmaManufacturerInfoException;

	public PharmaManufacturerInfo updateImpl(
		PharmaManufacturerInfo pharmaManufacturerInfo);

	/**
	 * Returns the pharma manufacturer info with the primary key or throws a <code>NoSuchPharmaManufacturerInfoException</code> if it could not be found.
	 *
	 * @param pharmaManufacturerInfoId the primary key of the pharma manufacturer info
	 * @return the pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a pharma manufacturer info with the primary key could not be found
	 */
	public PharmaManufacturerInfo findByPrimaryKey(
			long pharmaManufacturerInfoId)
		throws NoSuchPharmaManufacturerInfoException;

	/**
	 * Returns the pharma manufacturer info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaManufacturerInfoId the primary key of the pharma manufacturer info
	 * @return the pharma manufacturer info, or <code>null</code> if a pharma manufacturer info with the primary key could not be found
	 */
	public PharmaManufacturerInfo fetchByPrimaryKey(
		long pharmaManufacturerInfoId);

	/**
	 * Returns all the pharma manufacturer infos.
	 *
	 * @return the pharma manufacturer infos
	 */
	public java.util.List<PharmaManufacturerInfo> findAll();

	/**
	 * Returns a range of all the pharma manufacturer infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @return the range of pharma manufacturer infos
	 */
	public java.util.List<PharmaManufacturerInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the pharma manufacturer infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma manufacturer infos
	 */
	public java.util.List<PharmaManufacturerInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaManufacturerInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the pharma manufacturer infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma manufacturer infos
	 */
	public java.util.List<PharmaManufacturerInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaManufacturerInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma manufacturer infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma manufacturer infos.
	 *
	 * @return the number of pharma manufacturer infos
	 */
	public int countAll();

}