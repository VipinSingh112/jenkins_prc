/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareDescriptionOfServiceException;
import com.nbp.healthcare.application.form.service.model.HealthCareDescriptionOfService;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the health care description of service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDescriptionOfServiceUtil
 * @generated
 */
@ProviderType
public interface HealthCareDescriptionOfServicePersistence
	extends BasePersistence<HealthCareDescriptionOfService> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthCareDescriptionOfServiceUtil} to access the health care description of service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the health care description of service where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareDescriptionOfServiceException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care description of service
	 * @throws NoSuchHealthCareDescriptionOfServiceException if a matching health care description of service could not be found
	 */
	public HealthCareDescriptionOfService findBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareDescriptionOfServiceException;

	/**
	 * Returns the health care description of service where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care description of service, or <code>null</code> if a matching health care description of service could not be found
	 */
	public HealthCareDescriptionOfService fetchBygetHealthCareById(
		long healthCareApplicationId);

	/**
	 * Returns the health care description of service where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care description of service, or <code>null</code> if a matching health care description of service could not be found
	 */
	public HealthCareDescriptionOfService fetchBygetHealthCareById(
		long healthCareApplicationId, boolean useFinderCache);

	/**
	 * Removes the health care description of service where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care description of service that was removed
	 */
	public HealthCareDescriptionOfService removeBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareDescriptionOfServiceException;

	/**
	 * Returns the number of health care description of services where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care description of services
	 */
	public int countBygetHealthCareById(long healthCareApplicationId);

	/**
	 * Caches the health care description of service in the entity cache if it is enabled.
	 *
	 * @param healthCareDescriptionOfService the health care description of service
	 */
	public void cacheResult(
		HealthCareDescriptionOfService healthCareDescriptionOfService);

	/**
	 * Caches the health care description of services in the entity cache if it is enabled.
	 *
	 * @param healthCareDescriptionOfServices the health care description of services
	 */
	public void cacheResult(
		java.util.List<HealthCareDescriptionOfService>
			healthCareDescriptionOfServices);

	/**
	 * Creates a new health care description of service with the primary key. Does not add the health care description of service to the database.
	 *
	 * @param healthCareDescriptionId the primary key for the new health care description of service
	 * @return the new health care description of service
	 */
	public HealthCareDescriptionOfService create(long healthCareDescriptionId);

	/**
	 * Removes the health care description of service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareDescriptionId the primary key of the health care description of service
	 * @return the health care description of service that was removed
	 * @throws NoSuchHealthCareDescriptionOfServiceException if a health care description of service with the primary key could not be found
	 */
	public HealthCareDescriptionOfService remove(long healthCareDescriptionId)
		throws NoSuchHealthCareDescriptionOfServiceException;

	public HealthCareDescriptionOfService updateImpl(
		HealthCareDescriptionOfService healthCareDescriptionOfService);

	/**
	 * Returns the health care description of service with the primary key or throws a <code>NoSuchHealthCareDescriptionOfServiceException</code> if it could not be found.
	 *
	 * @param healthCareDescriptionId the primary key of the health care description of service
	 * @return the health care description of service
	 * @throws NoSuchHealthCareDescriptionOfServiceException if a health care description of service with the primary key could not be found
	 */
	public HealthCareDescriptionOfService findByPrimaryKey(
			long healthCareDescriptionId)
		throws NoSuchHealthCareDescriptionOfServiceException;

	/**
	 * Returns the health care description of service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareDescriptionId the primary key of the health care description of service
	 * @return the health care description of service, or <code>null</code> if a health care description of service with the primary key could not be found
	 */
	public HealthCareDescriptionOfService fetchByPrimaryKey(
		long healthCareDescriptionId);

	/**
	 * Returns all the health care description of services.
	 *
	 * @return the health care description of services
	 */
	public java.util.List<HealthCareDescriptionOfService> findAll();

	/**
	 * Returns a range of all the health care description of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDescriptionOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care description of services
	 * @param end the upper bound of the range of health care description of services (not inclusive)
	 * @return the range of health care description of services
	 */
	public java.util.List<HealthCareDescriptionOfService> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the health care description of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDescriptionOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care description of services
	 * @param end the upper bound of the range of health care description of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care description of services
	 */
	public java.util.List<HealthCareDescriptionOfService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareDescriptionOfService> orderByComparator);

	/**
	 * Returns an ordered range of all the health care description of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDescriptionOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care description of services
	 * @param end the upper bound of the range of health care description of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care description of services
	 */
	public java.util.List<HealthCareDescriptionOfService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareDescriptionOfService> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the health care description of services from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of health care description of services.
	 *
	 * @return the number of health care description of services
	 */
	public int countAll();

}