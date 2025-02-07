/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCCertificateOfServiceAddFormException;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfServiceAddForm;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc certificate of service add form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServiceAddFormUtil
 * @generated
 */
@ProviderType
public interface JADSCCertificateOfServiceAddFormPersistence
	extends BasePersistence<JADSCCertificateOfServiceAddForm> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JADSCCertificateOfServiceAddFormUtil} to access the jadsc certificate of service add form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of matching jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfServiceAddForm> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException;

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator);

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfServiceAddForm> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException;

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator);

	/**
	 * Returns the jadsc certificate of service add forms before and after the current jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service add form
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	public JADSCCertificateOfServiceAddForm[] findByUuid_PrevAndNext(
			long jadscCOSId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfServiceAddForm> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException;

	/**
	 * Removes all the jadsc certificate of service add forms where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc certificate of service add forms
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the jadsc certificate of service add form where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCCertificateOfServiceAddFormException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm findByUUID_G(
			String uuid, long groupId)
		throws NoSuchJADSCCertificateOfServiceAddFormException;

	/**
	 * Returns the jadsc certificate of service add form where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the jadsc certificate of service add form where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the jadsc certificate of service add form where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc certificate of service add form that was removed
	 */
	public JADSCCertificateOfServiceAddForm removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchJADSCCertificateOfServiceAddFormException;

	/**
	 * Returns the number of jadsc certificate of service add forms where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc certificate of service add forms
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of matching jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfServiceAddForm> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException;

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator);

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfServiceAddForm> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException;

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator);

	/**
	 * Returns the jadsc certificate of service add forms before and after the current jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service add form
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	public JADSCCertificateOfServiceAddForm[] findByUuid_C_PrevAndNext(
			long jadscCOSId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfServiceAddForm> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException;

	/**
	 * Removes all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc certificate of service add forms
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findBygetJADSCById(
		long jadscApplicationId);

	/**
	 * Returns a range of all the jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of matching jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findBygetJADSCById(
		long jadscApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findBygetJADSCById(
		long jadscApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findBygetJADSCById(
		long jadscApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm findBygetJADSCById_First(
			long jadscApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfServiceAddForm> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException;

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm fetchBygetJADSCById_First(
		long jadscApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator);

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm findBygetJADSCById_Last(
			long jadscApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfServiceAddForm> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException;

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public JADSCCertificateOfServiceAddForm fetchBygetJADSCById_Last(
		long jadscApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator);

	/**
	 * Returns the jadsc certificate of service add forms before and after the current jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service add form
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	public JADSCCertificateOfServiceAddForm[] findBygetJADSCById_PrevAndNext(
			long jadscCOSId, long jadscApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCCertificateOfServiceAddForm> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException;

	/**
	 * Removes all the jadsc certificate of service add forms where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 */
	public void removeBygetJADSCById(long jadscApplicationId);

	/**
	 * Returns the number of jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc certificate of service add forms
	 */
	public int countBygetJADSCById(long jadscApplicationId);

	/**
	 * Caches the jadsc certificate of service add form in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfServiceAddForm the jadsc certificate of service add form
	 */
	public void cacheResult(
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm);

	/**
	 * Caches the jadsc certificate of service add forms in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfServiceAddForms the jadsc certificate of service add forms
	 */
	public void cacheResult(
		java.util.List<JADSCCertificateOfServiceAddForm>
			jadscCertificateOfServiceAddForms);

	/**
	 * Creates a new jadsc certificate of service add form with the primary key. Does not add the jadsc certificate of service add form to the database.
	 *
	 * @param jadscCOSId the primary key for the new jadsc certificate of service add form
	 * @return the new jadsc certificate of service add form
	 */
	public JADSCCertificateOfServiceAddForm create(long jadscCOSId);

	/**
	 * Removes the jadsc certificate of service add form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form that was removed
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	public JADSCCertificateOfServiceAddForm remove(long jadscCOSId)
		throws NoSuchJADSCCertificateOfServiceAddFormException;

	public JADSCCertificateOfServiceAddForm updateImpl(
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm);

	/**
	 * Returns the jadsc certificate of service add form with the primary key or throws a <code>NoSuchJADSCCertificateOfServiceAddFormException</code> if it could not be found.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	public JADSCCertificateOfServiceAddForm findByPrimaryKey(long jadscCOSId)
		throws NoSuchJADSCCertificateOfServiceAddFormException;

	/**
	 * Returns the jadsc certificate of service add form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form, or <code>null</code> if a jadsc certificate of service add form with the primary key could not be found
	 */
	public JADSCCertificateOfServiceAddForm fetchByPrimaryKey(long jadscCOSId);

	/**
	 * Returns all the jadsc certificate of service add forms.
	 *
	 * @return the jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findAll();

	/**
	 * Returns a range of all the jadsc certificate of service add forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc certificate of service add forms
	 */
	public java.util.List<JADSCCertificateOfServiceAddForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCCertificateOfServiceAddForm> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc certificate of service add forms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc certificate of service add forms.
	 *
	 * @return the number of jadsc certificate of service add forms
	 */
	public int countAll();

}