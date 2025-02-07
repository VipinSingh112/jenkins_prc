/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quary.application.form.service.exception.NoSuchQuarryGeneralInformationException;
import com.nbp.quary.application.form.service.model.QuarryGeneralInformation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry general information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryGeneralInformationUtil
 * @generated
 */
@ProviderType
public interface QuarryGeneralInformationPersistence
	extends BasePersistence<QuarryGeneralInformation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryGeneralInformationUtil} to access the quarry general information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quarry general information where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryGeneralInformationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry general information
	 * @throws NoSuchQuarryGeneralInformationException if a matching quarry general information could not be found
	 */
	public QuarryGeneralInformation findBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryGeneralInformationException;

	/**
	 * Returns the quarry general information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry general information, or <code>null</code> if a matching quarry general information could not be found
	 */
	public QuarryGeneralInformation fetchBygetQuarry_ById(
		long quarryApplicationId);

	/**
	 * Returns the quarry general information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry general information, or <code>null</code> if a matching quarry general information could not be found
	 */
	public QuarryGeneralInformation fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache);

	/**
	 * Removes the quarry general information where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry general information that was removed
	 */
	public QuarryGeneralInformation removeBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryGeneralInformationException;

	/**
	 * Returns the number of quarry general informations where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry general informations
	 */
	public int countBygetQuarry_ById(long quarryApplicationId);

	/**
	 * Caches the quarry general information in the entity cache if it is enabled.
	 *
	 * @param quarryGeneralInformation the quarry general information
	 */
	public void cacheResult(QuarryGeneralInformation quarryGeneralInformation);

	/**
	 * Caches the quarry general informations in the entity cache if it is enabled.
	 *
	 * @param quarryGeneralInformations the quarry general informations
	 */
	public void cacheResult(
		java.util.List<QuarryGeneralInformation> quarryGeneralInformations);

	/**
	 * Creates a new quarry general information with the primary key. Does not add the quarry general information to the database.
	 *
	 * @param generalInfoId the primary key for the new quarry general information
	 * @return the new quarry general information
	 */
	public QuarryGeneralInformation create(long generalInfoId);

	/**
	 * Removes the quarry general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param generalInfoId the primary key of the quarry general information
	 * @return the quarry general information that was removed
	 * @throws NoSuchQuarryGeneralInformationException if a quarry general information with the primary key could not be found
	 */
	public QuarryGeneralInformation remove(long generalInfoId)
		throws NoSuchQuarryGeneralInformationException;

	public QuarryGeneralInformation updateImpl(
		QuarryGeneralInformation quarryGeneralInformation);

	/**
	 * Returns the quarry general information with the primary key or throws a <code>NoSuchQuarryGeneralInformationException</code> if it could not be found.
	 *
	 * @param generalInfoId the primary key of the quarry general information
	 * @return the quarry general information
	 * @throws NoSuchQuarryGeneralInformationException if a quarry general information with the primary key could not be found
	 */
	public QuarryGeneralInformation findByPrimaryKey(long generalInfoId)
		throws NoSuchQuarryGeneralInformationException;

	/**
	 * Returns the quarry general information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param generalInfoId the primary key of the quarry general information
	 * @return the quarry general information, or <code>null</code> if a quarry general information with the primary key could not be found
	 */
	public QuarryGeneralInformation fetchByPrimaryKey(long generalInfoId);

	/**
	 * Returns all the quarry general informations.
	 *
	 * @return the quarry general informations
	 */
	public java.util.List<QuarryGeneralInformation> findAll();

	/**
	 * Returns a range of all the quarry general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry general informations
	 * @param end the upper bound of the range of quarry general informations (not inclusive)
	 * @return the range of quarry general informations
	 */
	public java.util.List<QuarryGeneralInformation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the quarry general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry general informations
	 * @param end the upper bound of the range of quarry general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry general informations
	 */
	public java.util.List<QuarryGeneralInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryGeneralInformation> orderByComparator);

	/**
	 * Returns an ordered range of all the quarry general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry general informations
	 * @param end the upper bound of the range of quarry general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry general informations
	 */
	public java.util.List<QuarryGeneralInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryGeneralInformation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry general informations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry general informations.
	 *
	 * @return the number of quarry general informations
	 */
	public int countAll();

}