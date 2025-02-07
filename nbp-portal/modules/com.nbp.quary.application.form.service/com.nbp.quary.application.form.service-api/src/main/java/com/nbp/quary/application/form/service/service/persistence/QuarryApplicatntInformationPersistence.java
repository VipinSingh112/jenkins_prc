/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quary.application.form.service.exception.NoSuchQuarryApplicatntInformationException;
import com.nbp.quary.application.form.service.model.QuarryApplicatntInformation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry applicatnt information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicatntInformationUtil
 * @generated
 */
@ProviderType
public interface QuarryApplicatntInformationPersistence
	extends BasePersistence<QuarryApplicatntInformation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryApplicatntInformationUtil} to access the quarry applicatnt information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quarry applicatnt information where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryApplicatntInformationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry applicatnt information
	 * @throws NoSuchQuarryApplicatntInformationException if a matching quarry applicatnt information could not be found
	 */
	public QuarryApplicatntInformation findBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryApplicatntInformationException;

	/**
	 * Returns the quarry applicatnt information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry applicatnt information, or <code>null</code> if a matching quarry applicatnt information could not be found
	 */
	public QuarryApplicatntInformation fetchBygetQuarry_ById(
		long quarryApplicationId);

	/**
	 * Returns the quarry applicatnt information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry applicatnt information, or <code>null</code> if a matching quarry applicatnt information could not be found
	 */
	public QuarryApplicatntInformation fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache);

	/**
	 * Removes the quarry applicatnt information where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry applicatnt information that was removed
	 */
	public QuarryApplicatntInformation removeBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryApplicatntInformationException;

	/**
	 * Returns the number of quarry applicatnt informations where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry applicatnt informations
	 */
	public int countBygetQuarry_ById(long quarryApplicationId);

	/**
	 * Caches the quarry applicatnt information in the entity cache if it is enabled.
	 *
	 * @param quarryApplicatntInformation the quarry applicatnt information
	 */
	public void cacheResult(
		QuarryApplicatntInformation quarryApplicatntInformation);

	/**
	 * Caches the quarry applicatnt informations in the entity cache if it is enabled.
	 *
	 * @param quarryApplicatntInformations the quarry applicatnt informations
	 */
	public void cacheResult(
		java.util.List<QuarryApplicatntInformation>
			quarryApplicatntInformations);

	/**
	 * Creates a new quarry applicatnt information with the primary key. Does not add the quarry applicatnt information to the database.
	 *
	 * @param auarryApplicantId the primary key for the new quarry applicatnt information
	 * @return the new quarry applicatnt information
	 */
	public QuarryApplicatntInformation create(long auarryApplicantId);

	/**
	 * Removes the quarry applicatnt information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auarryApplicantId the primary key of the quarry applicatnt information
	 * @return the quarry applicatnt information that was removed
	 * @throws NoSuchQuarryApplicatntInformationException if a quarry applicatnt information with the primary key could not be found
	 */
	public QuarryApplicatntInformation remove(long auarryApplicantId)
		throws NoSuchQuarryApplicatntInformationException;

	public QuarryApplicatntInformation updateImpl(
		QuarryApplicatntInformation quarryApplicatntInformation);

	/**
	 * Returns the quarry applicatnt information with the primary key or throws a <code>NoSuchQuarryApplicatntInformationException</code> if it could not be found.
	 *
	 * @param auarryApplicantId the primary key of the quarry applicatnt information
	 * @return the quarry applicatnt information
	 * @throws NoSuchQuarryApplicatntInformationException if a quarry applicatnt information with the primary key could not be found
	 */
	public QuarryApplicatntInformation findByPrimaryKey(long auarryApplicantId)
		throws NoSuchQuarryApplicatntInformationException;

	/**
	 * Returns the quarry applicatnt information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auarryApplicantId the primary key of the quarry applicatnt information
	 * @return the quarry applicatnt information, or <code>null</code> if a quarry applicatnt information with the primary key could not be found
	 */
	public QuarryApplicatntInformation fetchByPrimaryKey(
		long auarryApplicantId);

	/**
	 * Returns all the quarry applicatnt informations.
	 *
	 * @return the quarry applicatnt informations
	 */
	public java.util.List<QuarryApplicatntInformation> findAll();

	/**
	 * Returns a range of all the quarry applicatnt informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicatntInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applicatnt informations
	 * @param end the upper bound of the range of quarry applicatnt informations (not inclusive)
	 * @return the range of quarry applicatnt informations
	 */
	public java.util.List<QuarryApplicatntInformation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the quarry applicatnt informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicatntInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applicatnt informations
	 * @param end the upper bound of the range of quarry applicatnt informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry applicatnt informations
	 */
	public java.util.List<QuarryApplicatntInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicatntInformation> orderByComparator);

	/**
	 * Returns an ordered range of all the quarry applicatnt informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicatntInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applicatnt informations
	 * @param end the upper bound of the range of quarry applicatnt informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry applicatnt informations
	 */
	public java.util.List<QuarryApplicatntInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicatntInformation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry applicatnt informations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry applicatnt informations.
	 *
	 * @return the number of quarry applicatnt informations
	 */
	public int countAll();

}