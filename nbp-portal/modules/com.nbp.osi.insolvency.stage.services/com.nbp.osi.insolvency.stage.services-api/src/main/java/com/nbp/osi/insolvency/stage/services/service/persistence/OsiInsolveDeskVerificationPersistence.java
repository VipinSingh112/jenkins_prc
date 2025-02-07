/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.stage.services.exception.NoSuchOsiInsolveDeskVerificationException;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi insolve desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolveDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface OsiInsolveDeskVerificationPersistence
	extends BasePersistence<OsiInsolveDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiInsolveDeskVerificationUtil} to access the osi insolve desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi insolve desk verifications where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolve desk verifications
	 */
	public java.util.List<OsiInsolveDeskVerification>
		findBygetDeskVerificationOsiInsolvencyById(long osiInsolvencyId);

	/**
	 * Returns a range of all the osi insolve desk verifications where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @return the range of matching osi insolve desk verifications
	 */
	public java.util.List<OsiInsolveDeskVerification>
		findBygetDeskVerificationOsiInsolvencyById(
			long osiInsolvencyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi insolve desk verifications where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolve desk verifications
	 */
	public java.util.List<OsiInsolveDeskVerification>
		findBygetDeskVerificationOsiInsolvencyById(
			long osiInsolvencyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolveDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolve desk verifications where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolve desk verifications
	 */
	public java.util.List<OsiInsolveDeskVerification>
		findBygetDeskVerificationOsiInsolvencyById(
			long osiInsolvencyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolveDeskVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi insolve desk verification in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolve desk verification
	 * @throws NoSuchOsiInsolveDeskVerificationException if a matching osi insolve desk verification could not be found
	 */
	public OsiInsolveDeskVerification
			findBygetDeskVerificationOsiInsolvencyById_First(
				long osiInsolvencyId,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolveDeskVerification> orderByComparator)
		throws NoSuchOsiInsolveDeskVerificationException;

	/**
	 * Returns the first osi insolve desk verification in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolve desk verification, or <code>null</code> if a matching osi insolve desk verification could not be found
	 */
	public OsiInsolveDeskVerification
		fetchBygetDeskVerificationOsiInsolvencyById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolveDeskVerification> orderByComparator);

	/**
	 * Returns the last osi insolve desk verification in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolve desk verification
	 * @throws NoSuchOsiInsolveDeskVerificationException if a matching osi insolve desk verification could not be found
	 */
	public OsiInsolveDeskVerification
			findBygetDeskVerificationOsiInsolvencyById_Last(
				long osiInsolvencyId,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolveDeskVerification> orderByComparator)
		throws NoSuchOsiInsolveDeskVerificationException;

	/**
	 * Returns the last osi insolve desk verification in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolve desk verification, or <code>null</code> if a matching osi insolve desk verification could not be found
	 */
	public OsiInsolveDeskVerification
		fetchBygetDeskVerificationOsiInsolvencyById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolveDeskVerification> orderByComparator);

	/**
	 * Returns the osi insolve desk verifications before and after the current osi insolve desk verification in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the current osi insolve desk verification
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolve desk verification
	 * @throws NoSuchOsiInsolveDeskVerificationException if a osi insolve desk verification with the primary key could not be found
	 */
	public OsiInsolveDeskVerification[]
			findBygetDeskVerificationOsiInsolvencyById_PrevAndNext(
				long OsiInsolveDeskVerificationId, long osiInsolvencyId,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolveDeskVerification> orderByComparator)
		throws NoSuchOsiInsolveDeskVerificationException;

	/**
	 * Removes all the osi insolve desk verifications where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetDeskVerificationOsiInsolvencyById(
		long osiInsolvencyId);

	/**
	 * Returns the number of osi insolve desk verifications where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolve desk verifications
	 */
	public int countBygetDeskVerificationOsiInsolvencyById(
		long osiInsolvencyId);

	/**
	 * Caches the osi insolve desk verification in the entity cache if it is enabled.
	 *
	 * @param osiInsolveDeskVerification the osi insolve desk verification
	 */
	public void cacheResult(
		OsiInsolveDeskVerification osiInsolveDeskVerification);

	/**
	 * Caches the osi insolve desk verifications in the entity cache if it is enabled.
	 *
	 * @param osiInsolveDeskVerifications the osi insolve desk verifications
	 */
	public void cacheResult(
		java.util.List<OsiInsolveDeskVerification> osiInsolveDeskVerifications);

	/**
	 * Creates a new osi insolve desk verification with the primary key. Does not add the osi insolve desk verification to the database.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key for the new osi insolve desk verification
	 * @return the new osi insolve desk verification
	 */
	public OsiInsolveDeskVerification create(long OsiInsolveDeskVerificationId);

	/**
	 * Removes the osi insolve desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the osi insolve desk verification
	 * @return the osi insolve desk verification that was removed
	 * @throws NoSuchOsiInsolveDeskVerificationException if a osi insolve desk verification with the primary key could not be found
	 */
	public OsiInsolveDeskVerification remove(long OsiInsolveDeskVerificationId)
		throws NoSuchOsiInsolveDeskVerificationException;

	public OsiInsolveDeskVerification updateImpl(
		OsiInsolveDeskVerification osiInsolveDeskVerification);

	/**
	 * Returns the osi insolve desk verification with the primary key or throws a <code>NoSuchOsiInsolveDeskVerificationException</code> if it could not be found.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the osi insolve desk verification
	 * @return the osi insolve desk verification
	 * @throws NoSuchOsiInsolveDeskVerificationException if a osi insolve desk verification with the primary key could not be found
	 */
	public OsiInsolveDeskVerification findByPrimaryKey(
			long OsiInsolveDeskVerificationId)
		throws NoSuchOsiInsolveDeskVerificationException;

	/**
	 * Returns the osi insolve desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the osi insolve desk verification
	 * @return the osi insolve desk verification, or <code>null</code> if a osi insolve desk verification with the primary key could not be found
	 */
	public OsiInsolveDeskVerification fetchByPrimaryKey(
		long OsiInsolveDeskVerificationId);

	/**
	 * Returns all the osi insolve desk verifications.
	 *
	 * @return the osi insolve desk verifications
	 */
	public java.util.List<OsiInsolveDeskVerification> findAll();

	/**
	 * Returns a range of all the osi insolve desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @return the range of osi insolve desk verifications
	 */
	public java.util.List<OsiInsolveDeskVerification> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi insolve desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolve desk verifications
	 */
	public java.util.List<OsiInsolveDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolveDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolve desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolve desk verifications
	 */
	public java.util.List<OsiInsolveDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolveDeskVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi insolve desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi insolve desk verifications.
	 *
	 * @return the number of osi insolve desk verifications
	 */
	public int countAll();

}