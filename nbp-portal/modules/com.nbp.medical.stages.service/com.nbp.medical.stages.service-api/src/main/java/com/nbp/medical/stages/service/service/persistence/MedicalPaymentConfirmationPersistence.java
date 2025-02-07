/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.stages.service.exception.NoSuchMedicalPaymentConfirmationException;
import com.nbp.medical.stages.service.model.MedicalPaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalPaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface MedicalPaymentConfirmationPersistence
	extends BasePersistence<MedicalPaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalPaymentConfirmationUtil} to access the medical payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the medical payment confirmation where caseId = &#63; or throws a <code>NoSuchMedicalPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical payment confirmation
	 * @throws NoSuchMedicalPaymentConfirmationException if a matching medical payment confirmation could not be found
	 */
	public MedicalPaymentConfirmation findBygetMedicalPaymentConfBy_CI(
			String caseId)
		throws NoSuchMedicalPaymentConfirmationException;

	/**
	 * Returns the medical payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical payment confirmation, or <code>null</code> if a matching medical payment confirmation could not be found
	 */
	public MedicalPaymentConfirmation fetchBygetMedicalPaymentConfBy_CI(
		String caseId);

	/**
	 * Returns the medical payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical payment confirmation, or <code>null</code> if a matching medical payment confirmation could not be found
	 */
	public MedicalPaymentConfirmation fetchBygetMedicalPaymentConfBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the medical payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical payment confirmation that was removed
	 */
	public MedicalPaymentConfirmation removeBygetMedicalPaymentConfBy_CI(
			String caseId)
		throws NoSuchMedicalPaymentConfirmationException;

	/**
	 * Returns the number of medical payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical payment confirmations
	 */
	public int countBygetMedicalPaymentConfBy_CI(String caseId);

	/**
	 * Returns all the medical payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching medical payment confirmations
	 */
	public java.util.List<MedicalPaymentConfirmation>
		findBygetMedicalPayConfBy_CI(String caseId);

	/**
	 * Returns a range of all the medical payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @return the range of matching medical payment confirmations
	 */
	public java.util.List<MedicalPaymentConfirmation>
		findBygetMedicalPayConfBy_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the medical payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical payment confirmations
	 */
	public java.util.List<MedicalPaymentConfirmation>
		findBygetMedicalPayConfBy_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the medical payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical payment confirmations
	 */
	public java.util.List<MedicalPaymentConfirmation>
		findBygetMedicalPayConfBy_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalPaymentConfirmation> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first medical payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical payment confirmation
	 * @throws NoSuchMedicalPaymentConfirmationException if a matching medical payment confirmation could not be found
	 */
	public MedicalPaymentConfirmation findBygetMedicalPayConfBy_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalPaymentConfirmation> orderByComparator)
		throws NoSuchMedicalPaymentConfirmationException;

	/**
	 * Returns the first medical payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical payment confirmation, or <code>null</code> if a matching medical payment confirmation could not be found
	 */
	public MedicalPaymentConfirmation fetchBygetMedicalPayConfBy_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalPaymentConfirmation> orderByComparator);

	/**
	 * Returns the last medical payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical payment confirmation
	 * @throws NoSuchMedicalPaymentConfirmationException if a matching medical payment confirmation could not be found
	 */
	public MedicalPaymentConfirmation findBygetMedicalPayConfBy_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalPaymentConfirmation> orderByComparator)
		throws NoSuchMedicalPaymentConfirmationException;

	/**
	 * Returns the last medical payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical payment confirmation, or <code>null</code> if a matching medical payment confirmation could not be found
	 */
	public MedicalPaymentConfirmation fetchBygetMedicalPayConfBy_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalPaymentConfirmation> orderByComparator);

	/**
	 * Returns the medical payment confirmations before and after the current medical payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param medicalPaymentConfirmationId the primary key of the current medical payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical payment confirmation
	 * @throws NoSuchMedicalPaymentConfirmationException if a medical payment confirmation with the primary key could not be found
	 */
	public MedicalPaymentConfirmation[]
			findBygetMedicalPayConfBy_CI_PrevAndNext(
				long medicalPaymentConfirmationId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MedicalPaymentConfirmation> orderByComparator)
		throws NoSuchMedicalPaymentConfirmationException;

	/**
	 * Removes all the medical payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetMedicalPayConfBy_CI(String caseId);

	/**
	 * Returns the number of medical payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical payment confirmations
	 */
	public int countBygetMedicalPayConfBy_CI(String caseId);

	/**
	 * Caches the medical payment confirmation in the entity cache if it is enabled.
	 *
	 * @param medicalPaymentConfirmation the medical payment confirmation
	 */
	public void cacheResult(
		MedicalPaymentConfirmation medicalPaymentConfirmation);

	/**
	 * Caches the medical payment confirmations in the entity cache if it is enabled.
	 *
	 * @param medicalPaymentConfirmations the medical payment confirmations
	 */
	public void cacheResult(
		java.util.List<MedicalPaymentConfirmation> medicalPaymentConfirmations);

	/**
	 * Creates a new medical payment confirmation with the primary key. Does not add the medical payment confirmation to the database.
	 *
	 * @param medicalPaymentConfirmationId the primary key for the new medical payment confirmation
	 * @return the new medical payment confirmation
	 */
	public MedicalPaymentConfirmation create(long medicalPaymentConfirmationId);

	/**
	 * Removes the medical payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalPaymentConfirmationId the primary key of the medical payment confirmation
	 * @return the medical payment confirmation that was removed
	 * @throws NoSuchMedicalPaymentConfirmationException if a medical payment confirmation with the primary key could not be found
	 */
	public MedicalPaymentConfirmation remove(long medicalPaymentConfirmationId)
		throws NoSuchMedicalPaymentConfirmationException;

	public MedicalPaymentConfirmation updateImpl(
		MedicalPaymentConfirmation medicalPaymentConfirmation);

	/**
	 * Returns the medical payment confirmation with the primary key or throws a <code>NoSuchMedicalPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param medicalPaymentConfirmationId the primary key of the medical payment confirmation
	 * @return the medical payment confirmation
	 * @throws NoSuchMedicalPaymentConfirmationException if a medical payment confirmation with the primary key could not be found
	 */
	public MedicalPaymentConfirmation findByPrimaryKey(
			long medicalPaymentConfirmationId)
		throws NoSuchMedicalPaymentConfirmationException;

	/**
	 * Returns the medical payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalPaymentConfirmationId the primary key of the medical payment confirmation
	 * @return the medical payment confirmation, or <code>null</code> if a medical payment confirmation with the primary key could not be found
	 */
	public MedicalPaymentConfirmation fetchByPrimaryKey(
		long medicalPaymentConfirmationId);

	/**
	 * Returns all the medical payment confirmations.
	 *
	 * @return the medical payment confirmations
	 */
	public java.util.List<MedicalPaymentConfirmation> findAll();

	/**
	 * Returns a range of all the medical payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @return the range of medical payment confirmations
	 */
	public java.util.List<MedicalPaymentConfirmation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the medical payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical payment confirmations
	 */
	public java.util.List<MedicalPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the medical payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical payment confirmations
	 */
	public java.util.List<MedicalPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalPaymentConfirmation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical payment confirmations.
	 *
	 * @return the number of medical payment confirmations
	 */
	public int countAll();

}