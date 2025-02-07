/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionDomesticServiceException;
import com.nbp.jtb.application.form.service.model.AttractionDomesticService;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction domestic service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionDomesticServiceUtil
 * @generated
 */
@ProviderType
public interface AttractionDomesticServicePersistence
	extends BasePersistence<AttractionDomesticService> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionDomesticServiceUtil} to access the attraction domestic service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction domestic service where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionDomesticServiceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction domestic service
	 * @throws NoSuchAttractionDomesticServiceException if a matching attraction domestic service could not be found
	 */
	public AttractionDomesticService findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionDomesticServiceException;

	/**
	 * Returns the attraction domestic service where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction domestic service, or <code>null</code> if a matching attraction domestic service could not be found
	 */
	public AttractionDomesticService fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction domestic service where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction domestic service, or <code>null</code> if a matching attraction domestic service could not be found
	 */
	public AttractionDomesticService fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction domestic service where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction domestic service that was removed
	 */
	public AttractionDomesticService removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionDomesticServiceException;

	/**
	 * Returns the number of attraction domestic services where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction domestic services
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction domestic service in the entity cache if it is enabled.
	 *
	 * @param attractionDomesticService the attraction domestic service
	 */
	public void cacheResult(
		AttractionDomesticService attractionDomesticService);

	/**
	 * Caches the attraction domestic services in the entity cache if it is enabled.
	 *
	 * @param attractionDomesticServices the attraction domestic services
	 */
	public void cacheResult(
		java.util.List<AttractionDomesticService> attractionDomesticServices);

	/**
	 * Creates a new attraction domestic service with the primary key. Does not add the attraction domestic service to the database.
	 *
	 * @param attractionDomesticServId the primary key for the new attraction domestic service
	 * @return the new attraction domestic service
	 */
	public AttractionDomesticService create(long attractionDomesticServId);

	/**
	 * Removes the attraction domestic service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionDomesticServId the primary key of the attraction domestic service
	 * @return the attraction domestic service that was removed
	 * @throws NoSuchAttractionDomesticServiceException if a attraction domestic service with the primary key could not be found
	 */
	public AttractionDomesticService remove(long attractionDomesticServId)
		throws NoSuchAttractionDomesticServiceException;

	public AttractionDomesticService updateImpl(
		AttractionDomesticService attractionDomesticService);

	/**
	 * Returns the attraction domestic service with the primary key or throws a <code>NoSuchAttractionDomesticServiceException</code> if it could not be found.
	 *
	 * @param attractionDomesticServId the primary key of the attraction domestic service
	 * @return the attraction domestic service
	 * @throws NoSuchAttractionDomesticServiceException if a attraction domestic service with the primary key could not be found
	 */
	public AttractionDomesticService findByPrimaryKey(
			long attractionDomesticServId)
		throws NoSuchAttractionDomesticServiceException;

	/**
	 * Returns the attraction domestic service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionDomesticServId the primary key of the attraction domestic service
	 * @return the attraction domestic service, or <code>null</code> if a attraction domestic service with the primary key could not be found
	 */
	public AttractionDomesticService fetchByPrimaryKey(
		long attractionDomesticServId);

	/**
	 * Returns all the attraction domestic services.
	 *
	 * @return the attraction domestic services
	 */
	public java.util.List<AttractionDomesticService> findAll();

	/**
	 * Returns a range of all the attraction domestic services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic services
	 * @param end the upper bound of the range of attraction domestic services (not inclusive)
	 * @return the range of attraction domestic services
	 */
	public java.util.List<AttractionDomesticService> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the attraction domestic services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic services
	 * @param end the upper bound of the range of attraction domestic services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction domestic services
	 */
	public java.util.List<AttractionDomesticService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionDomesticService> orderByComparator);

	/**
	 * Returns an ordered range of all the attraction domestic services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic services
	 * @param end the upper bound of the range of attraction domestic services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction domestic services
	 */
	public java.util.List<AttractionDomesticService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionDomesticService> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction domestic services from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction domestic services.
	 *
	 * @return the number of attraction domestic services
	 */
	public int countAll();

}