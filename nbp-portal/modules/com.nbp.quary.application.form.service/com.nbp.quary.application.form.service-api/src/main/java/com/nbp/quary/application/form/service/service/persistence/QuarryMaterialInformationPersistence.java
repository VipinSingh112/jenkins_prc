/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quary.application.form.service.exception.NoSuchQuarryMaterialInformationException;
import com.nbp.quary.application.form.service.model.QuarryMaterialInformation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry material information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformationUtil
 * @generated
 */
@ProviderType
public interface QuarryMaterialInformationPersistence
	extends BasePersistence<QuarryMaterialInformation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryMaterialInformationUtil} to access the quarry material information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quarry material information where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryMaterialInformationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry material information
	 * @throws NoSuchQuarryMaterialInformationException if a matching quarry material information could not be found
	 */
	public QuarryMaterialInformation findBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryMaterialInformationException;

	/**
	 * Returns the quarry material information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry material information, or <code>null</code> if a matching quarry material information could not be found
	 */
	public QuarryMaterialInformation fetchBygetQuarry_ById(
		long quarryApplicationId);

	/**
	 * Returns the quarry material information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry material information, or <code>null</code> if a matching quarry material information could not be found
	 */
	public QuarryMaterialInformation fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache);

	/**
	 * Removes the quarry material information where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry material information that was removed
	 */
	public QuarryMaterialInformation removeBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryMaterialInformationException;

	/**
	 * Returns the number of quarry material informations where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry material informations
	 */
	public int countBygetQuarry_ById(long quarryApplicationId);

	/**
	 * Caches the quarry material information in the entity cache if it is enabled.
	 *
	 * @param quarryMaterialInformation the quarry material information
	 */
	public void cacheResult(
		QuarryMaterialInformation quarryMaterialInformation);

	/**
	 * Caches the quarry material informations in the entity cache if it is enabled.
	 *
	 * @param quarryMaterialInformations the quarry material informations
	 */
	public void cacheResult(
		java.util.List<QuarryMaterialInformation> quarryMaterialInformations);

	/**
	 * Creates a new quarry material information with the primary key. Does not add the quarry material information to the database.
	 *
	 * @param materialInfoId the primary key for the new quarry material information
	 * @return the new quarry material information
	 */
	public QuarryMaterialInformation create(long materialInfoId);

	/**
	 * Removes the quarry material information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param materialInfoId the primary key of the quarry material information
	 * @return the quarry material information that was removed
	 * @throws NoSuchQuarryMaterialInformationException if a quarry material information with the primary key could not be found
	 */
	public QuarryMaterialInformation remove(long materialInfoId)
		throws NoSuchQuarryMaterialInformationException;

	public QuarryMaterialInformation updateImpl(
		QuarryMaterialInformation quarryMaterialInformation);

	/**
	 * Returns the quarry material information with the primary key or throws a <code>NoSuchQuarryMaterialInformationException</code> if it could not be found.
	 *
	 * @param materialInfoId the primary key of the quarry material information
	 * @return the quarry material information
	 * @throws NoSuchQuarryMaterialInformationException if a quarry material information with the primary key could not be found
	 */
	public QuarryMaterialInformation findByPrimaryKey(long materialInfoId)
		throws NoSuchQuarryMaterialInformationException;

	/**
	 * Returns the quarry material information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param materialInfoId the primary key of the quarry material information
	 * @return the quarry material information, or <code>null</code> if a quarry material information with the primary key could not be found
	 */
	public QuarryMaterialInformation fetchByPrimaryKey(long materialInfoId);

	/**
	 * Returns all the quarry material informations.
	 *
	 * @return the quarry material informations
	 */
	public java.util.List<QuarryMaterialInformation> findAll();

	/**
	 * Returns a range of all the quarry material informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material informations
	 * @param end the upper bound of the range of quarry material informations (not inclusive)
	 * @return the range of quarry material informations
	 */
	public java.util.List<QuarryMaterialInformation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the quarry material informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material informations
	 * @param end the upper bound of the range of quarry material informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry material informations
	 */
	public java.util.List<QuarryMaterialInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryMaterialInformation> orderByComparator);

	/**
	 * Returns an ordered range of all the quarry material informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material informations
	 * @param end the upper bound of the range of quarry material informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry material informations
	 */
	public java.util.List<QuarryMaterialInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryMaterialInformation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry material informations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry material informations.
	 *
	 * @return the number of quarry material informations
	 */
	public int countAll();

}