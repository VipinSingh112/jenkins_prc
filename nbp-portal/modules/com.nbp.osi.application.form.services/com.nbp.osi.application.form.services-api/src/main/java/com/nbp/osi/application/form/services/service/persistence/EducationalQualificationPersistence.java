/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.application.form.services.exception.NoSuchEducationalQualificationException;
import com.nbp.osi.application.form.services.model.EducationalQualification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the educational qualification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EducationalQualificationUtil
 * @generated
 */
@ProviderType
public interface EducationalQualificationPersistence
	extends BasePersistence<EducationalQualification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EducationalQualificationUtil} to access the educational qualification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the educational qualifications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching educational qualifications
	 */
	public java.util.List<EducationalQualification> findByUuid(String uuid);

	/**
	 * Returns a range of all the educational qualifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @return the range of matching educational qualifications
	 */
	public java.util.List<EducationalQualification> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the educational qualifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching educational qualifications
	 */
	public java.util.List<EducationalQualification> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator);

	/**
	 * Returns an ordered range of all the educational qualifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching educational qualifications
	 */
	public java.util.List<EducationalQualification> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public EducationalQualification findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException;

	/**
	 * Returns the first educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public EducationalQualification fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator);

	/**
	 * Returns the last educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public EducationalQualification findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException;

	/**
	 * Returns the last educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public EducationalQualification fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator);

	/**
	 * Returns the educational qualifications before and after the current educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param educationalDetailId the primary key of the current educational qualification
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next educational qualification
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	public EducationalQualification[] findByUuid_PrevAndNext(
			long educationalDetailId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException;

	/**
	 * Removes all the educational qualifications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of educational qualifications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching educational qualifications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the educational qualification where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEducationalQualificationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public EducationalQualification findByUUID_G(String uuid, long groupId)
		throws NoSuchEducationalQualificationException;

	/**
	 * Returns the educational qualification where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public EducationalQualification fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the educational qualification where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public EducationalQualification fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the educational qualification where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the educational qualification that was removed
	 */
	public EducationalQualification removeByUUID_G(String uuid, long groupId)
		throws NoSuchEducationalQualificationException;

	/**
	 * Returns the number of educational qualifications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching educational qualifications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the educational qualifications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching educational qualifications
	 */
	public java.util.List<EducationalQualification> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the educational qualifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @return the range of matching educational qualifications
	 */
	public java.util.List<EducationalQualification> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the educational qualifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching educational qualifications
	 */
	public java.util.List<EducationalQualification> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator);

	/**
	 * Returns an ordered range of all the educational qualifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching educational qualifications
	 */
	public java.util.List<EducationalQualification> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public EducationalQualification findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException;

	/**
	 * Returns the first educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public EducationalQualification fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator);

	/**
	 * Returns the last educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public EducationalQualification findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException;

	/**
	 * Returns the last educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public EducationalQualification fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator);

	/**
	 * Returns the educational qualifications before and after the current educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param educationalDetailId the primary key of the current educational qualification
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next educational qualification
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	public EducationalQualification[] findByUuid_C_PrevAndNext(
			long educationalDetailId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException;

	/**
	 * Removes all the educational qualifications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of educational qualifications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching educational qualifications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the educational qualifications where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching educational qualifications
	 */
	public java.util.List<EducationalQualification> findBygetOsiById(
		long osiApplicationId);

	/**
	 * Returns a range of all the educational qualifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @return the range of matching educational qualifications
	 */
	public java.util.List<EducationalQualification> findBygetOsiById(
		long osiApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the educational qualifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching educational qualifications
	 */
	public java.util.List<EducationalQualification> findBygetOsiById(
		long osiApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator);

	/**
	 * Returns an ordered range of all the educational qualifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching educational qualifications
	 */
	public java.util.List<EducationalQualification> findBygetOsiById(
		long osiApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public EducationalQualification findBygetOsiById_First(
			long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException;

	/**
	 * Returns the first educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public EducationalQualification fetchBygetOsiById_First(
		long osiApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator);

	/**
	 * Returns the last educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public EducationalQualification findBygetOsiById_Last(
			long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException;

	/**
	 * Returns the last educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public EducationalQualification fetchBygetOsiById_Last(
		long osiApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator);

	/**
	 * Returns the educational qualifications before and after the current educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param educationalDetailId the primary key of the current educational qualification
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next educational qualification
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	public EducationalQualification[] findBygetOsiById_PrevAndNext(
			long educationalDetailId, long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException;

	/**
	 * Removes all the educational qualifications where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 */
	public void removeBygetOsiById(long osiApplicationId);

	/**
	 * Returns the number of educational qualifications where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching educational qualifications
	 */
	public int countBygetOsiById(long osiApplicationId);

	/**
	 * Caches the educational qualification in the entity cache if it is enabled.
	 *
	 * @param educationalQualification the educational qualification
	 */
	public void cacheResult(EducationalQualification educationalQualification);

	/**
	 * Caches the educational qualifications in the entity cache if it is enabled.
	 *
	 * @param educationalQualifications the educational qualifications
	 */
	public void cacheResult(
		java.util.List<EducationalQualification> educationalQualifications);

	/**
	 * Creates a new educational qualification with the primary key. Does not add the educational qualification to the database.
	 *
	 * @param educationalDetailId the primary key for the new educational qualification
	 * @return the new educational qualification
	 */
	public EducationalQualification create(long educationalDetailId);

	/**
	 * Removes the educational qualification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param educationalDetailId the primary key of the educational qualification
	 * @return the educational qualification that was removed
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	public EducationalQualification remove(long educationalDetailId)
		throws NoSuchEducationalQualificationException;

	public EducationalQualification updateImpl(
		EducationalQualification educationalQualification);

	/**
	 * Returns the educational qualification with the primary key or throws a <code>NoSuchEducationalQualificationException</code> if it could not be found.
	 *
	 * @param educationalDetailId the primary key of the educational qualification
	 * @return the educational qualification
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	public EducationalQualification findByPrimaryKey(long educationalDetailId)
		throws NoSuchEducationalQualificationException;

	/**
	 * Returns the educational qualification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param educationalDetailId the primary key of the educational qualification
	 * @return the educational qualification, or <code>null</code> if a educational qualification with the primary key could not be found
	 */
	public EducationalQualification fetchByPrimaryKey(long educationalDetailId);

	/**
	 * Returns all the educational qualifications.
	 *
	 * @return the educational qualifications
	 */
	public java.util.List<EducationalQualification> findAll();

	/**
	 * Returns a range of all the educational qualifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @return the range of educational qualifications
	 */
	public java.util.List<EducationalQualification> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the educational qualifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of educational qualifications
	 */
	public java.util.List<EducationalQualification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator);

	/**
	 * Returns an ordered range of all the educational qualifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of educational qualifications
	 */
	public java.util.List<EducationalQualification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EducationalQualification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the educational qualifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of educational qualifications.
	 *
	 * @return the number of educational qualifications
	 */
	public int countAll();

}