/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareApplicantInfoException;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicantInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the health care applicant info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicantInfoUtil
 * @generated
 */
@ProviderType
public interface HealthCareApplicantInfoPersistence
	extends BasePersistence<HealthCareApplicantInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthCareApplicantInfoUtil} to access the health care applicant info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the health care applicant info where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareApplicantInfoException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care applicant info
	 * @throws NoSuchHealthCareApplicantInfoException if a matching health care applicant info could not be found
	 */
	public HealthCareApplicantInfo findBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicantInfoException;

	/**
	 * Returns the health care applicant info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care applicant info, or <code>null</code> if a matching health care applicant info could not be found
	 */
	public HealthCareApplicantInfo fetchBygetHealthCareById(
		long healthCareApplicationId);

	/**
	 * Returns the health care applicant info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care applicant info, or <code>null</code> if a matching health care applicant info could not be found
	 */
	public HealthCareApplicantInfo fetchBygetHealthCareById(
		long healthCareApplicationId, boolean useFinderCache);

	/**
	 * Removes the health care applicant info where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care applicant info that was removed
	 */
	public HealthCareApplicantInfo removeBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicantInfoException;

	/**
	 * Returns the number of health care applicant infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care applicant infos
	 */
	public int countBygetHealthCareById(long healthCareApplicationId);

	/**
	 * Caches the health care applicant info in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicantInfo the health care applicant info
	 */
	public void cacheResult(HealthCareApplicantInfo healthCareApplicantInfo);

	/**
	 * Caches the health care applicant infos in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicantInfos the health care applicant infos
	 */
	public void cacheResult(
		java.util.List<HealthCareApplicantInfo> healthCareApplicantInfos);

	/**
	 * Creates a new health care applicant info with the primary key. Does not add the health care applicant info to the database.
	 *
	 * @param healthCareApplicantInfoId the primary key for the new health care applicant info
	 * @return the new health care applicant info
	 */
	public HealthCareApplicantInfo create(long healthCareApplicantInfoId);

	/**
	 * Removes the health care applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareApplicantInfoId the primary key of the health care applicant info
	 * @return the health care applicant info that was removed
	 * @throws NoSuchHealthCareApplicantInfoException if a health care applicant info with the primary key could not be found
	 */
	public HealthCareApplicantInfo remove(long healthCareApplicantInfoId)
		throws NoSuchHealthCareApplicantInfoException;

	public HealthCareApplicantInfo updateImpl(
		HealthCareApplicantInfo healthCareApplicantInfo);

	/**
	 * Returns the health care applicant info with the primary key or throws a <code>NoSuchHealthCareApplicantInfoException</code> if it could not be found.
	 *
	 * @param healthCareApplicantInfoId the primary key of the health care applicant info
	 * @return the health care applicant info
	 * @throws NoSuchHealthCareApplicantInfoException if a health care applicant info with the primary key could not be found
	 */
	public HealthCareApplicantInfo findByPrimaryKey(
			long healthCareApplicantInfoId)
		throws NoSuchHealthCareApplicantInfoException;

	/**
	 * Returns the health care applicant info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareApplicantInfoId the primary key of the health care applicant info
	 * @return the health care applicant info, or <code>null</code> if a health care applicant info with the primary key could not be found
	 */
	public HealthCareApplicantInfo fetchByPrimaryKey(
		long healthCareApplicantInfoId);

	/**
	 * Returns all the health care applicant infos.
	 *
	 * @return the health care applicant infos
	 */
	public java.util.List<HealthCareApplicantInfo> findAll();

	/**
	 * Returns a range of all the health care applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant infos
	 * @param end the upper bound of the range of health care applicant infos (not inclusive)
	 * @return the range of health care applicant infos
	 */
	public java.util.List<HealthCareApplicantInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the health care applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant infos
	 * @param end the upper bound of the range of health care applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care applicant infos
	 */
	public java.util.List<HealthCareApplicantInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareApplicantInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the health care applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant infos
	 * @param end the upper bound of the range of health care applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care applicant infos
	 */
	public java.util.List<HealthCareApplicantInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareApplicantInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the health care applicant infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of health care applicant infos.
	 *
	 * @return the number of health care applicant infos
	 */
	public int countAll();

}