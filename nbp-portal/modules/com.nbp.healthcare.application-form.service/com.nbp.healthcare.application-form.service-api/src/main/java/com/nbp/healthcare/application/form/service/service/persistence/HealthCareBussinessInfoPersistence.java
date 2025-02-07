/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareBussinessInfoException;
import com.nbp.healthcare.application.form.service.model.HealthCareBussinessInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the health care bussiness info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareBussinessInfoUtil
 * @generated
 */
@ProviderType
public interface HealthCareBussinessInfoPersistence
	extends BasePersistence<HealthCareBussinessInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthCareBussinessInfoUtil} to access the health care bussiness info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the health care bussiness info where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareBussinessInfoException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care bussiness info
	 * @throws NoSuchHealthCareBussinessInfoException if a matching health care bussiness info could not be found
	 */
	public HealthCareBussinessInfo findBygetHealthCareByid(
			long healthCareApplicationId)
		throws NoSuchHealthCareBussinessInfoException;

	/**
	 * Returns the health care bussiness info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care bussiness info, or <code>null</code> if a matching health care bussiness info could not be found
	 */
	public HealthCareBussinessInfo fetchBygetHealthCareByid(
		long healthCareApplicationId);

	/**
	 * Returns the health care bussiness info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care bussiness info, or <code>null</code> if a matching health care bussiness info could not be found
	 */
	public HealthCareBussinessInfo fetchBygetHealthCareByid(
		long healthCareApplicationId, boolean useFinderCache);

	/**
	 * Removes the health care bussiness info where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care bussiness info that was removed
	 */
	public HealthCareBussinessInfo removeBygetHealthCareByid(
			long healthCareApplicationId)
		throws NoSuchHealthCareBussinessInfoException;

	/**
	 * Returns the number of health care bussiness infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care bussiness infos
	 */
	public int countBygetHealthCareByid(long healthCareApplicationId);

	/**
	 * Caches the health care bussiness info in the entity cache if it is enabled.
	 *
	 * @param healthCareBussinessInfo the health care bussiness info
	 */
	public void cacheResult(HealthCareBussinessInfo healthCareBussinessInfo);

	/**
	 * Caches the health care bussiness infos in the entity cache if it is enabled.
	 *
	 * @param healthCareBussinessInfos the health care bussiness infos
	 */
	public void cacheResult(
		java.util.List<HealthCareBussinessInfo> healthCareBussinessInfos);

	/**
	 * Creates a new health care bussiness info with the primary key. Does not add the health care bussiness info to the database.
	 *
	 * @param healthCareBussinessInfoId the primary key for the new health care bussiness info
	 * @return the new health care bussiness info
	 */
	public HealthCareBussinessInfo create(long healthCareBussinessInfoId);

	/**
	 * Removes the health care bussiness info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareBussinessInfoId the primary key of the health care bussiness info
	 * @return the health care bussiness info that was removed
	 * @throws NoSuchHealthCareBussinessInfoException if a health care bussiness info with the primary key could not be found
	 */
	public HealthCareBussinessInfo remove(long healthCareBussinessInfoId)
		throws NoSuchHealthCareBussinessInfoException;

	public HealthCareBussinessInfo updateImpl(
		HealthCareBussinessInfo healthCareBussinessInfo);

	/**
	 * Returns the health care bussiness info with the primary key or throws a <code>NoSuchHealthCareBussinessInfoException</code> if it could not be found.
	 *
	 * @param healthCareBussinessInfoId the primary key of the health care bussiness info
	 * @return the health care bussiness info
	 * @throws NoSuchHealthCareBussinessInfoException if a health care bussiness info with the primary key could not be found
	 */
	public HealthCareBussinessInfo findByPrimaryKey(
			long healthCareBussinessInfoId)
		throws NoSuchHealthCareBussinessInfoException;

	/**
	 * Returns the health care bussiness info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareBussinessInfoId the primary key of the health care bussiness info
	 * @return the health care bussiness info, or <code>null</code> if a health care bussiness info with the primary key could not be found
	 */
	public HealthCareBussinessInfo fetchByPrimaryKey(
		long healthCareBussinessInfoId);

	/**
	 * Returns all the health care bussiness infos.
	 *
	 * @return the health care bussiness infos
	 */
	public java.util.List<HealthCareBussinessInfo> findAll();

	/**
	 * Returns a range of all the health care bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care bussiness infos
	 * @param end the upper bound of the range of health care bussiness infos (not inclusive)
	 * @return the range of health care bussiness infos
	 */
	public java.util.List<HealthCareBussinessInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the health care bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care bussiness infos
	 * @param end the upper bound of the range of health care bussiness infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care bussiness infos
	 */
	public java.util.List<HealthCareBussinessInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareBussinessInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the health care bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care bussiness infos
	 * @param end the upper bound of the range of health care bussiness infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care bussiness infos
	 */
	public java.util.List<HealthCareBussinessInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareBussinessInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the health care bussiness infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of health care bussiness infos.
	 *
	 * @return the number of health care bussiness infos
	 */
	public int countAll();

}