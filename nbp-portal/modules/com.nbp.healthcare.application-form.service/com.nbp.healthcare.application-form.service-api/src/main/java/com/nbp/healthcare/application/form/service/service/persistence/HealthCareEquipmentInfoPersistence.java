/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareEquipmentInfoException;
import com.nbp.healthcare.application.form.service.model.HealthCareEquipmentInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the health care equipment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareEquipmentInfoUtil
 * @generated
 */
@ProviderType
public interface HealthCareEquipmentInfoPersistence
	extends BasePersistence<HealthCareEquipmentInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthCareEquipmentInfoUtil} to access the health care equipment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the health care equipment info where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareEquipmentInfoException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a matching health care equipment info could not be found
	 */
	public HealthCareEquipmentInfo findBygetHelthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareEquipmentInfoException;

	/**
	 * Returns the health care equipment info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care equipment info, or <code>null</code> if a matching health care equipment info could not be found
	 */
	public HealthCareEquipmentInfo fetchBygetHelthCareById(
		long healthCareApplicationId);

	/**
	 * Returns the health care equipment info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care equipment info, or <code>null</code> if a matching health care equipment info could not be found
	 */
	public HealthCareEquipmentInfo fetchBygetHelthCareById(
		long healthCareApplicationId, boolean useFinderCache);

	/**
	 * Removes the health care equipment info where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care equipment info that was removed
	 */
	public HealthCareEquipmentInfo removeBygetHelthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareEquipmentInfoException;

	/**
	 * Returns the number of health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care equipment infos
	 */
	public int countBygetHelthCareById(long healthCareApplicationId);

	/**
	 * Returns all the health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care equipment infos
	 */
	public java.util.List<HealthCareEquipmentInfo> findBygetHC_EB_HAI(
		long healthCareApplicationId);

	/**
	 * Returns a range of all the health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @return the range of matching health care equipment infos
	 */
	public java.util.List<HealthCareEquipmentInfo> findBygetHC_EB_HAI(
		long healthCareApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health care equipment infos
	 */
	public java.util.List<HealthCareEquipmentInfo> findBygetHC_EB_HAI(
		long healthCareApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareEquipmentInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health care equipment infos
	 */
	public java.util.List<HealthCareEquipmentInfo> findBygetHC_EB_HAI(
		long healthCareApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareEquipmentInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a matching health care equipment info could not be found
	 */
	public HealthCareEquipmentInfo findBygetHC_EB_HAI_First(
			long healthCareApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthCareEquipmentInfo> orderByComparator)
		throws NoSuchHealthCareEquipmentInfoException;

	/**
	 * Returns the first health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care equipment info, or <code>null</code> if a matching health care equipment info could not be found
	 */
	public HealthCareEquipmentInfo fetchBygetHC_EB_HAI_First(
		long healthCareApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareEquipmentInfo> orderByComparator);

	/**
	 * Returns the last health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a matching health care equipment info could not be found
	 */
	public HealthCareEquipmentInfo findBygetHC_EB_HAI_Last(
			long healthCareApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthCareEquipmentInfo> orderByComparator)
		throws NoSuchHealthCareEquipmentInfoException;

	/**
	 * Returns the last health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care equipment info, or <code>null</code> if a matching health care equipment info could not be found
	 */
	public HealthCareEquipmentInfo fetchBygetHC_EB_HAI_Last(
		long healthCareApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareEquipmentInfo> orderByComparator);

	/**
	 * Returns the health care equipment infos before and after the current health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the current health care equipment info
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a health care equipment info with the primary key could not be found
	 */
	public HealthCareEquipmentInfo[] findBygetHC_EB_HAI_PrevAndNext(
			long healthCareEquipmentInfoId, long healthCareApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthCareEquipmentInfo> orderByComparator)
		throws NoSuchHealthCareEquipmentInfoException;

	/**
	 * Removes all the health care equipment infos where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 */
	public void removeBygetHC_EB_HAI(long healthCareApplicationId);

	/**
	 * Returns the number of health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care equipment infos
	 */
	public int countBygetHC_EB_HAI(long healthCareApplicationId);

	/**
	 * Caches the health care equipment info in the entity cache if it is enabled.
	 *
	 * @param healthCareEquipmentInfo the health care equipment info
	 */
	public void cacheResult(HealthCareEquipmentInfo healthCareEquipmentInfo);

	/**
	 * Caches the health care equipment infos in the entity cache if it is enabled.
	 *
	 * @param healthCareEquipmentInfos the health care equipment infos
	 */
	public void cacheResult(
		java.util.List<HealthCareEquipmentInfo> healthCareEquipmentInfos);

	/**
	 * Creates a new health care equipment info with the primary key. Does not add the health care equipment info to the database.
	 *
	 * @param healthCareEquipmentInfoId the primary key for the new health care equipment info
	 * @return the new health care equipment info
	 */
	public HealthCareEquipmentInfo create(long healthCareEquipmentInfoId);

	/**
	 * Removes the health care equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the health care equipment info
	 * @return the health care equipment info that was removed
	 * @throws NoSuchHealthCareEquipmentInfoException if a health care equipment info with the primary key could not be found
	 */
	public HealthCareEquipmentInfo remove(long healthCareEquipmentInfoId)
		throws NoSuchHealthCareEquipmentInfoException;

	public HealthCareEquipmentInfo updateImpl(
		HealthCareEquipmentInfo healthCareEquipmentInfo);

	/**
	 * Returns the health care equipment info with the primary key or throws a <code>NoSuchHealthCareEquipmentInfoException</code> if it could not be found.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the health care equipment info
	 * @return the health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a health care equipment info with the primary key could not be found
	 */
	public HealthCareEquipmentInfo findByPrimaryKey(
			long healthCareEquipmentInfoId)
		throws NoSuchHealthCareEquipmentInfoException;

	/**
	 * Returns the health care equipment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the health care equipment info
	 * @return the health care equipment info, or <code>null</code> if a health care equipment info with the primary key could not be found
	 */
	public HealthCareEquipmentInfo fetchByPrimaryKey(
		long healthCareEquipmentInfoId);

	/**
	 * Returns all the health care equipment infos.
	 *
	 * @return the health care equipment infos
	 */
	public java.util.List<HealthCareEquipmentInfo> findAll();

	/**
	 * Returns a range of all the health care equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @return the range of health care equipment infos
	 */
	public java.util.List<HealthCareEquipmentInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the health care equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care equipment infos
	 */
	public java.util.List<HealthCareEquipmentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareEquipmentInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the health care equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care equipment infos
	 */
	public java.util.List<HealthCareEquipmentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareEquipmentInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the health care equipment infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of health care equipment infos.
	 *
	 * @return the number of health care equipment infos
	 */
	public int countAll();

}