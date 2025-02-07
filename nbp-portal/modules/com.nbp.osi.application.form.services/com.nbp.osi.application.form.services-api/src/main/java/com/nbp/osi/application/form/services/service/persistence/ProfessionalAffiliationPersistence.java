/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.application.form.services.exception.NoSuchProfessionalAffiliationException;
import com.nbp.osi.application.form.services.model.ProfessionalAffiliation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the professional affiliation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProfessionalAffiliationUtil
 * @generated
 */
@ProviderType
public interface ProfessionalAffiliationPersistence
	extends BasePersistence<ProfessionalAffiliation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProfessionalAffiliationUtil} to access the professional affiliation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the professional affiliation where osiApplicationId = &#63; or throws a <code>NoSuchProfessionalAffiliationException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching professional affiliation
	 * @throws NoSuchProfessionalAffiliationException if a matching professional affiliation could not be found
	 */
	public ProfessionalAffiliation findBygetOsiById(long osiApplicationId)
		throws NoSuchProfessionalAffiliationException;

	/**
	 * Returns the professional affiliation where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching professional affiliation, or <code>null</code> if a matching professional affiliation could not be found
	 */
	public ProfessionalAffiliation fetchBygetOsiById(long osiApplicationId);

	/**
	 * Returns the professional affiliation where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching professional affiliation, or <code>null</code> if a matching professional affiliation could not be found
	 */
	public ProfessionalAffiliation fetchBygetOsiById(
		long osiApplicationId, boolean useFinderCache);

	/**
	 * Removes the professional affiliation where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the professional affiliation that was removed
	 */
	public ProfessionalAffiliation removeBygetOsiById(long osiApplicationId)
		throws NoSuchProfessionalAffiliationException;

	/**
	 * Returns the number of professional affiliations where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching professional affiliations
	 */
	public int countBygetOsiById(long osiApplicationId);

	/**
	 * Caches the professional affiliation in the entity cache if it is enabled.
	 *
	 * @param professionalAffiliation the professional affiliation
	 */
	public void cacheResult(ProfessionalAffiliation professionalAffiliation);

	/**
	 * Caches the professional affiliations in the entity cache if it is enabled.
	 *
	 * @param professionalAffiliations the professional affiliations
	 */
	public void cacheResult(
		java.util.List<ProfessionalAffiliation> professionalAffiliations);

	/**
	 * Creates a new professional affiliation with the primary key. Does not add the professional affiliation to the database.
	 *
	 * @param professionalAffiliationId the primary key for the new professional affiliation
	 * @return the new professional affiliation
	 */
	public ProfessionalAffiliation create(long professionalAffiliationId);

	/**
	 * Removes the professional affiliation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param professionalAffiliationId the primary key of the professional affiliation
	 * @return the professional affiliation that was removed
	 * @throws NoSuchProfessionalAffiliationException if a professional affiliation with the primary key could not be found
	 */
	public ProfessionalAffiliation remove(long professionalAffiliationId)
		throws NoSuchProfessionalAffiliationException;

	public ProfessionalAffiliation updateImpl(
		ProfessionalAffiliation professionalAffiliation);

	/**
	 * Returns the professional affiliation with the primary key or throws a <code>NoSuchProfessionalAffiliationException</code> if it could not be found.
	 *
	 * @param professionalAffiliationId the primary key of the professional affiliation
	 * @return the professional affiliation
	 * @throws NoSuchProfessionalAffiliationException if a professional affiliation with the primary key could not be found
	 */
	public ProfessionalAffiliation findByPrimaryKey(
			long professionalAffiliationId)
		throws NoSuchProfessionalAffiliationException;

	/**
	 * Returns the professional affiliation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param professionalAffiliationId the primary key of the professional affiliation
	 * @return the professional affiliation, or <code>null</code> if a professional affiliation with the primary key could not be found
	 */
	public ProfessionalAffiliation fetchByPrimaryKey(
		long professionalAffiliationId);

	/**
	 * Returns all the professional affiliations.
	 *
	 * @return the professional affiliations
	 */
	public java.util.List<ProfessionalAffiliation> findAll();

	/**
	 * Returns a range of all the professional affiliations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessionalAffiliationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professional affiliations
	 * @param end the upper bound of the range of professional affiliations (not inclusive)
	 * @return the range of professional affiliations
	 */
	public java.util.List<ProfessionalAffiliation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the professional affiliations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessionalAffiliationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professional affiliations
	 * @param end the upper bound of the range of professional affiliations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of professional affiliations
	 */
	public java.util.List<ProfessionalAffiliation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ProfessionalAffiliation> orderByComparator);

	/**
	 * Returns an ordered range of all the professional affiliations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessionalAffiliationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professional affiliations
	 * @param end the upper bound of the range of professional affiliations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of professional affiliations
	 */
	public java.util.List<ProfessionalAffiliation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ProfessionalAffiliation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the professional affiliations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of professional affiliations.
	 *
	 * @return the number of professional affiliations
	 */
	public int countAll();

}