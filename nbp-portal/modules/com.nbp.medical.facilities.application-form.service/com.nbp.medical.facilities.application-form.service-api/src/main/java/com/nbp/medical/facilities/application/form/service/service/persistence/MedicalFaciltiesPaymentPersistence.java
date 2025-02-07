/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFaciltiesPaymentException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFaciltiesPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical facilties payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFaciltiesPaymentUtil
 * @generated
 */
@ProviderType
public interface MedicalFaciltiesPaymentPersistence
	extends BasePersistence<MedicalFaciltiesPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalFaciltiesPaymentUtil} to access the medical facilties payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the medical facilties payment where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFaciltiesPaymentException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilties payment
	 * @throws NoSuchMedicalFaciltiesPaymentException if a matching medical facilties payment could not be found
	 */
	public MedicalFaciltiesPayment findBygetMedicalAppById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFaciltiesPaymentException;

	/**
	 * Returns the medical facilties payment where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilties payment, or <code>null</code> if a matching medical facilties payment could not be found
	 */
	public MedicalFaciltiesPayment fetchBygetMedicalAppById(
		long medicalFacilitiesAppId);

	/**
	 * Returns the medical facilties payment where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilties payment, or <code>null</code> if a matching medical facilties payment could not be found
	 */
	public MedicalFaciltiesPayment fetchBygetMedicalAppById(
		long medicalFacilitiesAppId, boolean useFinderCache);

	/**
	 * Removes the medical facilties payment where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilties payment that was removed
	 */
	public MedicalFaciltiesPayment removeBygetMedicalAppById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFaciltiesPaymentException;

	/**
	 * Returns the number of medical facilties payments where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilties payments
	 */
	public int countBygetMedicalAppById(long medicalFacilitiesAppId);

	/**
	 * Caches the medical facilties payment in the entity cache if it is enabled.
	 *
	 * @param medicalFaciltiesPayment the medical facilties payment
	 */
	public void cacheResult(MedicalFaciltiesPayment medicalFaciltiesPayment);

	/**
	 * Caches the medical facilties payments in the entity cache if it is enabled.
	 *
	 * @param medicalFaciltiesPayments the medical facilties payments
	 */
	public void cacheResult(
		java.util.List<MedicalFaciltiesPayment> medicalFaciltiesPayments);

	/**
	 * Creates a new medical facilties payment with the primary key. Does not add the medical facilties payment to the database.
	 *
	 * @param medicalFaciltiesPaymentId the primary key for the new medical facilties payment
	 * @return the new medical facilties payment
	 */
	public MedicalFaciltiesPayment create(long medicalFaciltiesPaymentId);

	/**
	 * Removes the medical facilties payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFaciltiesPaymentId the primary key of the medical facilties payment
	 * @return the medical facilties payment that was removed
	 * @throws NoSuchMedicalFaciltiesPaymentException if a medical facilties payment with the primary key could not be found
	 */
	public MedicalFaciltiesPayment remove(long medicalFaciltiesPaymentId)
		throws NoSuchMedicalFaciltiesPaymentException;

	public MedicalFaciltiesPayment updateImpl(
		MedicalFaciltiesPayment medicalFaciltiesPayment);

	/**
	 * Returns the medical facilties payment with the primary key or throws a <code>NoSuchMedicalFaciltiesPaymentException</code> if it could not be found.
	 *
	 * @param medicalFaciltiesPaymentId the primary key of the medical facilties payment
	 * @return the medical facilties payment
	 * @throws NoSuchMedicalFaciltiesPaymentException if a medical facilties payment with the primary key could not be found
	 */
	public MedicalFaciltiesPayment findByPrimaryKey(
			long medicalFaciltiesPaymentId)
		throws NoSuchMedicalFaciltiesPaymentException;

	/**
	 * Returns the medical facilties payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFaciltiesPaymentId the primary key of the medical facilties payment
	 * @return the medical facilties payment, or <code>null</code> if a medical facilties payment with the primary key could not be found
	 */
	public MedicalFaciltiesPayment fetchByPrimaryKey(
		long medicalFaciltiesPaymentId);

	/**
	 * Returns all the medical facilties payments.
	 *
	 * @return the medical facilties payments
	 */
	public java.util.List<MedicalFaciltiesPayment> findAll();

	/**
	 * Returns a range of all the medical facilties payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFaciltiesPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilties payments
	 * @param end the upper bound of the range of medical facilties payments (not inclusive)
	 * @return the range of medical facilties payments
	 */
	public java.util.List<MedicalFaciltiesPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the medical facilties payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFaciltiesPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilties payments
	 * @param end the upper bound of the range of medical facilties payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilties payments
	 */
	public java.util.List<MedicalFaciltiesPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFaciltiesPayment> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilties payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFaciltiesPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilties payments
	 * @param end the upper bound of the range of medical facilties payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilties payments
	 */
	public java.util.List<MedicalFaciltiesPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFaciltiesPayment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical facilties payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical facilties payments.
	 *
	 * @return the number of medical facilties payments
	 */
	public int countAll();

}