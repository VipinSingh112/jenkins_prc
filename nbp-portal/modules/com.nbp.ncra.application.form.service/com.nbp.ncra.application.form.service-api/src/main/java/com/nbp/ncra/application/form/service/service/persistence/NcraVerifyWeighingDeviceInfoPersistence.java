/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncra.application.form.service.exception.NoSuchNcraVerifyWeighingDeviceInfoException;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncra verify weighing device info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDeviceInfoUtil
 * @generated
 */
@ProviderType
public interface NcraVerifyWeighingDeviceInfoPersistence
	extends BasePersistence<NcraVerifyWeighingDeviceInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcraVerifyWeighingDeviceInfoUtil} to access the ncra verify weighing device info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncra verify weighing device info where ncraApplicationId = &#63; or throws a <code>NoSuchNcraVerifyWeighingDeviceInfoException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a matching ncra verify weighing device info could not be found
	 */
	public NcraVerifyWeighingDeviceInfo findBygetNcraVerify_By_NCRA_Id(
			long ncraApplicationId)
		throws NoSuchNcraVerifyWeighingDeviceInfoException;

	/**
	 * Returns the ncra verify weighing device info where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing device info, or <code>null</code> if a matching ncra verify weighing device info could not be found
	 */
	public NcraVerifyWeighingDeviceInfo fetchBygetNcraVerify_By_NCRA_Id(
		long ncraApplicationId);

	/**
	 * Returns the ncra verify weighing device info where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra verify weighing device info, or <code>null</code> if a matching ncra verify weighing device info could not be found
	 */
	public NcraVerifyWeighingDeviceInfo fetchBygetNcraVerify_By_NCRA_Id(
		long ncraApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncra verify weighing device info where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra verify weighing device info that was removed
	 */
	public NcraVerifyWeighingDeviceInfo removeBygetNcraVerify_By_NCRA_Id(
			long ncraApplicationId)
		throws NoSuchNcraVerifyWeighingDeviceInfoException;

	/**
	 * Returns the number of ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra verify weighing device infos
	 */
	public int countBygetNcraVerify_By_NCRA_Id(long ncraApplicationId);

	/**
	 * Returns all the ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing device infos
	 */
	public java.util.List<NcraVerifyWeighingDeviceInfo>
		findBygetNcraVerify_By_DataList(long ncraApplicationId);

	/**
	 * Returns a range of all the ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @return the range of matching ncra verify weighing device infos
	 */
	public java.util.List<NcraVerifyWeighingDeviceInfo>
		findBygetNcraVerify_By_DataList(
			long ncraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra verify weighing device infos
	 */
	public java.util.List<NcraVerifyWeighingDeviceInfo>
		findBygetNcraVerify_By_DataList(
			long ncraApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraVerifyWeighingDeviceInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra verify weighing device infos
	 */
	public java.util.List<NcraVerifyWeighingDeviceInfo>
		findBygetNcraVerify_By_DataList(
			long ncraApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraVerifyWeighingDeviceInfo> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a matching ncra verify weighing device info could not be found
	 */
	public NcraVerifyWeighingDeviceInfo findBygetNcraVerify_By_DataList_First(
			long ncraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraVerifyWeighingDeviceInfo> orderByComparator)
		throws NoSuchNcraVerifyWeighingDeviceInfoException;

	/**
	 * Returns the first ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra verify weighing device info, or <code>null</code> if a matching ncra verify weighing device info could not be found
	 */
	public NcraVerifyWeighingDeviceInfo fetchBygetNcraVerify_By_DataList_First(
		long ncraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcraVerifyWeighingDeviceInfo> orderByComparator);

	/**
	 * Returns the last ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a matching ncra verify weighing device info could not be found
	 */
	public NcraVerifyWeighingDeviceInfo findBygetNcraVerify_By_DataList_Last(
			long ncraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraVerifyWeighingDeviceInfo> orderByComparator)
		throws NoSuchNcraVerifyWeighingDeviceInfoException;

	/**
	 * Returns the last ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra verify weighing device info, or <code>null</code> if a matching ncra verify weighing device info could not be found
	 */
	public NcraVerifyWeighingDeviceInfo fetchBygetNcraVerify_By_DataList_Last(
		long ncraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcraVerifyWeighingDeviceInfo> orderByComparator);

	/**
	 * Returns the ncra verify weighing device infos before and after the current ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the current ncra verify weighing device info
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a ncra verify weighing device info with the primary key could not be found
	 */
	public NcraVerifyWeighingDeviceInfo[]
			findBygetNcraVerify_By_DataList_PrevAndNext(
				long ncraVerifyWeighingDeviceInfoId, long ncraApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<NcraVerifyWeighingDeviceInfo> orderByComparator)
		throws NoSuchNcraVerifyWeighingDeviceInfoException;

	/**
	 * Removes all the ncra verify weighing device infos where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 */
	public void removeBygetNcraVerify_By_DataList(long ncraApplicationId);

	/**
	 * Returns the number of ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra verify weighing device infos
	 */
	public int countBygetNcraVerify_By_DataList(long ncraApplicationId);

	/**
	 * Caches the ncra verify weighing device info in the entity cache if it is enabled.
	 *
	 * @param ncraVerifyWeighingDeviceInfo the ncra verify weighing device info
	 */
	public void cacheResult(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo);

	/**
	 * Caches the ncra verify weighing device infos in the entity cache if it is enabled.
	 *
	 * @param ncraVerifyWeighingDeviceInfos the ncra verify weighing device infos
	 */
	public void cacheResult(
		java.util.List<NcraVerifyWeighingDeviceInfo>
			ncraVerifyWeighingDeviceInfos);

	/**
	 * Creates a new ncra verify weighing device info with the primary key. Does not add the ncra verify weighing device info to the database.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key for the new ncra verify weighing device info
	 * @return the new ncra verify weighing device info
	 */
	public NcraVerifyWeighingDeviceInfo create(
		long ncraVerifyWeighingDeviceInfoId);

	/**
	 * Removes the ncra verify weighing device info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info that was removed
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a ncra verify weighing device info with the primary key could not be found
	 */
	public NcraVerifyWeighingDeviceInfo remove(
			long ncraVerifyWeighingDeviceInfoId)
		throws NoSuchNcraVerifyWeighingDeviceInfoException;

	public NcraVerifyWeighingDeviceInfo updateImpl(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo);

	/**
	 * Returns the ncra verify weighing device info with the primary key or throws a <code>NoSuchNcraVerifyWeighingDeviceInfoException</code> if it could not be found.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a ncra verify weighing device info with the primary key could not be found
	 */
	public NcraVerifyWeighingDeviceInfo findByPrimaryKey(
			long ncraVerifyWeighingDeviceInfoId)
		throws NoSuchNcraVerifyWeighingDeviceInfoException;

	/**
	 * Returns the ncra verify weighing device info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info, or <code>null</code> if a ncra verify weighing device info with the primary key could not be found
	 */
	public NcraVerifyWeighingDeviceInfo fetchByPrimaryKey(
		long ncraVerifyWeighingDeviceInfoId);

	/**
	 * Returns all the ncra verify weighing device infos.
	 *
	 * @return the ncra verify weighing device infos
	 */
	public java.util.List<NcraVerifyWeighingDeviceInfo> findAll();

	/**
	 * Returns a range of all the ncra verify weighing device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @return the range of ncra verify weighing device infos
	 */
	public java.util.List<NcraVerifyWeighingDeviceInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the ncra verify weighing device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra verify weighing device infos
	 */
	public java.util.List<NcraVerifyWeighingDeviceInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcraVerifyWeighingDeviceInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the ncra verify weighing device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra verify weighing device infos
	 */
	public java.util.List<NcraVerifyWeighingDeviceInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcraVerifyWeighingDeviceInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncra verify weighing device infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncra verify weighing device infos.
	 *
	 * @return the number of ncra verify weighing device infos
	 */
	public int countAll();

}