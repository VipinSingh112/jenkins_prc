/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.stages.service.exception.NoSuchOSIServicesRecommendationsException;
import com.nbp.osi.services.stages.service.model.OSIServicesRecommendations;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services recommendations service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesRecommendationsUtil
 * @generated
 */
@ProviderType
public interface OSIServicesRecommendationsPersistence
	extends BasePersistence<OSIServicesRecommendations> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OSIServicesRecommendationsUtil} to access the osi services recommendations persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi services recommendations where caseId = &#63; or throws a <code>NoSuchOSIServicesRecommendationsException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services recommendations
	 * @throws NoSuchOSIServicesRecommendationsException if a matching osi services recommendations could not be found
	 */
	public OSIServicesRecommendations
			findBygetOsiServicesRecommendationByCaseId(String caseId)
		throws NoSuchOSIServicesRecommendationsException;

	/**
	 * Returns the osi services recommendations where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services recommendations, or <code>null</code> if a matching osi services recommendations could not be found
	 */
	public OSIServicesRecommendations
		fetchBygetOsiServicesRecommendationByCaseId(String caseId);

	/**
	 * Returns the osi services recommendations where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services recommendations, or <code>null</code> if a matching osi services recommendations could not be found
	 */
	public OSIServicesRecommendations
		fetchBygetOsiServicesRecommendationByCaseId(
			String caseId, boolean useFinderCache);

	/**
	 * Removes the osi services recommendations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi services recommendations that was removed
	 */
	public OSIServicesRecommendations
			removeBygetOsiServicesRecommendationByCaseId(String caseId)
		throws NoSuchOSIServicesRecommendationsException;

	/**
	 * Returns the number of osi services recommendationses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi services recommendationses
	 */
	public int countBygetOsiServicesRecommendationByCaseId(String caseId);

	/**
	 * Caches the osi services recommendations in the entity cache if it is enabled.
	 *
	 * @param osiServicesRecommendations the osi services recommendations
	 */
	public void cacheResult(
		OSIServicesRecommendations osiServicesRecommendations);

	/**
	 * Caches the osi services recommendationses in the entity cache if it is enabled.
	 *
	 * @param osiServicesRecommendationses the osi services recommendationses
	 */
	public void cacheResult(
		java.util.List<OSIServicesRecommendations>
			osiServicesRecommendationses);

	/**
	 * Creates a new osi services recommendations with the primary key. Does not add the osi services recommendations to the database.
	 *
	 * @param oSIServicesRecommendationsId the primary key for the new osi services recommendations
	 * @return the new osi services recommendations
	 */
	public OSIServicesRecommendations create(long oSIServicesRecommendationsId);

	/**
	 * Removes the osi services recommendations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oSIServicesRecommendationsId the primary key of the osi services recommendations
	 * @return the osi services recommendations that was removed
	 * @throws NoSuchOSIServicesRecommendationsException if a osi services recommendations with the primary key could not be found
	 */
	public OSIServicesRecommendations remove(long oSIServicesRecommendationsId)
		throws NoSuchOSIServicesRecommendationsException;

	public OSIServicesRecommendations updateImpl(
		OSIServicesRecommendations osiServicesRecommendations);

	/**
	 * Returns the osi services recommendations with the primary key or throws a <code>NoSuchOSIServicesRecommendationsException</code> if it could not be found.
	 *
	 * @param oSIServicesRecommendationsId the primary key of the osi services recommendations
	 * @return the osi services recommendations
	 * @throws NoSuchOSIServicesRecommendationsException if a osi services recommendations with the primary key could not be found
	 */
	public OSIServicesRecommendations findByPrimaryKey(
			long oSIServicesRecommendationsId)
		throws NoSuchOSIServicesRecommendationsException;

	/**
	 * Returns the osi services recommendations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oSIServicesRecommendationsId the primary key of the osi services recommendations
	 * @return the osi services recommendations, or <code>null</code> if a osi services recommendations with the primary key could not be found
	 */
	public OSIServicesRecommendations fetchByPrimaryKey(
		long oSIServicesRecommendationsId);

	/**
	 * Returns all the osi services recommendationses.
	 *
	 * @return the osi services recommendationses
	 */
	public java.util.List<OSIServicesRecommendations> findAll();

	/**
	 * Returns a range of all the osi services recommendationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesRecommendationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services recommendationses
	 * @param end the upper bound of the range of osi services recommendationses (not inclusive)
	 * @return the range of osi services recommendationses
	 */
	public java.util.List<OSIServicesRecommendations> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi services recommendationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesRecommendationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services recommendationses
	 * @param end the upper bound of the range of osi services recommendationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services recommendationses
	 */
	public java.util.List<OSIServicesRecommendations> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OSIServicesRecommendations> orderByComparator);

	/**
	 * Returns an ordered range of all the osi services recommendationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesRecommendationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services recommendationses
	 * @param end the upper bound of the range of osi services recommendationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services recommendationses
	 */
	public java.util.List<OSIServicesRecommendations> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OSIServicesRecommendations> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi services recommendationses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services recommendationses.
	 *
	 * @return the number of osi services recommendationses
	 */
	public int countAll();

}