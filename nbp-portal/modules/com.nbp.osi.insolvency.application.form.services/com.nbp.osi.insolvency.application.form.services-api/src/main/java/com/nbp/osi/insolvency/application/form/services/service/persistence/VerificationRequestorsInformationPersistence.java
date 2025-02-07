/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchVerificationRequestorsInformationException;
import com.nbp.osi.insolvency.application.form.services.model.VerificationRequestorsInformation;

import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the verification requestors information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VerificationRequestorsInformationUtil
 * @generated
 */
@ProviderType
public interface VerificationRequestorsInformationPersistence
	extends BasePersistence<VerificationRequestorsInformation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VerificationRequestorsInformationUtil} to access the verification requestors information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the verification requestors information where osiInsolvencyId = &#63; or throws a <code>NoSuchVerificationRequestorsInformationException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification requestors information
	 * @throws NoSuchVerificationRequestorsInformationException if a matching verification requestors information could not be found
	 */
	public VerificationRequestorsInformation findBygetOsiById(
			long osiInsolvencyId)
		throws NoSuchVerificationRequestorsInformationException;

	/**
	 * Returns the verification requestors information where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification requestors information, or <code>null</code> if a matching verification requestors information could not be found
	 */
	public VerificationRequestorsInformation fetchBygetOsiById(
		long osiInsolvencyId);

	/**
	 * Returns the verification requestors information where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching verification requestors information, or <code>null</code> if a matching verification requestors information could not be found
	 */
	public VerificationRequestorsInformation fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the verification requestors information where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the verification requestors information that was removed
	 */
	public VerificationRequestorsInformation removeBygetOsiById(
			long osiInsolvencyId)
		throws NoSuchVerificationRequestorsInformationException;

	/**
	 * Returns the number of verification requestors informations where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching verification requestors informations
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the verification requestors information in the entity cache if it is enabled.
	 *
	 * @param verificationRequestorsInformation the verification requestors information
	 */
	public void cacheResult(
		VerificationRequestorsInformation verificationRequestorsInformation);

	/**
	 * Caches the verification requestors informations in the entity cache if it is enabled.
	 *
	 * @param verificationRequestorsInformations the verification requestors informations
	 */
	public void cacheResult(
		java.util.List<VerificationRequestorsInformation>
			verificationRequestorsInformations);

	/**
	 * Creates a new verification requestors information with the primary key. Does not add the verification requestors information to the database.
	 *
	 * @param verificationRequestorsInformationPK the primary key for the new verification requestors information
	 * @return the new verification requestors information
	 */
	public VerificationRequestorsInformation create(
		VerificationRequestorsInformationPK
			verificationRequestorsInformationPK);

	/**
	 * Removes the verification requestors information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param verificationRequestorsInformationPK the primary key of the verification requestors information
	 * @return the verification requestors information that was removed
	 * @throws NoSuchVerificationRequestorsInformationException if a verification requestors information with the primary key could not be found
	 */
	public VerificationRequestorsInformation remove(
			VerificationRequestorsInformationPK
				verificationRequestorsInformationPK)
		throws NoSuchVerificationRequestorsInformationException;

	public VerificationRequestorsInformation updateImpl(
		VerificationRequestorsInformation verificationRequestorsInformation);

	/**
	 * Returns the verification requestors information with the primary key or throws a <code>NoSuchVerificationRequestorsInformationException</code> if it could not be found.
	 *
	 * @param verificationRequestorsInformationPK the primary key of the verification requestors information
	 * @return the verification requestors information
	 * @throws NoSuchVerificationRequestorsInformationException if a verification requestors information with the primary key could not be found
	 */
	public VerificationRequestorsInformation findByPrimaryKey(
			VerificationRequestorsInformationPK
				verificationRequestorsInformationPK)
		throws NoSuchVerificationRequestorsInformationException;

	/**
	 * Returns the verification requestors information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param verificationRequestorsInformationPK the primary key of the verification requestors information
	 * @return the verification requestors information, or <code>null</code> if a verification requestors information with the primary key could not be found
	 */
	public VerificationRequestorsInformation fetchByPrimaryKey(
		VerificationRequestorsInformationPK
			verificationRequestorsInformationPK);

	/**
	 * Returns all the verification requestors informations.
	 *
	 * @return the verification requestors informations
	 */
	public java.util.List<VerificationRequestorsInformation> findAll();

	/**
	 * Returns a range of all the verification requestors informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors informations
	 * @param end the upper bound of the range of verification requestors informations (not inclusive)
	 * @return the range of verification requestors informations
	 */
	public java.util.List<VerificationRequestorsInformation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the verification requestors informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors informations
	 * @param end the upper bound of the range of verification requestors informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of verification requestors informations
	 */
	public java.util.List<VerificationRequestorsInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<VerificationRequestorsInformation> orderByComparator);

	/**
	 * Returns an ordered range of all the verification requestors informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors informations
	 * @param end the upper bound of the range of verification requestors informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of verification requestors informations
	 */
	public java.util.List<VerificationRequestorsInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<VerificationRequestorsInformation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the verification requestors informations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of verification requestors informations.
	 *
	 * @return the number of verification requestors informations
	 */
	public int countAll();

	public Set<String> getCompoundPKColumnNames();

}