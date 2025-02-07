/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccCerBodyGeneralException;
import com.nbp.janaac.application.form.service.model.AccCerBodyGeneral;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc cer body general service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyGeneralUtil
 * @generated
 */
@ProviderType
public interface AccCerBodyGeneralPersistence
	extends BasePersistence<AccCerBodyGeneral> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccCerBodyGeneralUtil} to access the acc cer body general persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc cer body generals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc cer body generals
	 */
	public java.util.List<AccCerBodyGeneral> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc cer body generals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyGeneralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body generals
	 * @param end the upper bound of the range of acc cer body generals (not inclusive)
	 * @return the range of matching acc cer body generals
	 */
	public java.util.List<AccCerBodyGeneral> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body generals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyGeneralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body generals
	 * @param end the upper bound of the range of acc cer body generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body generals
	 */
	public java.util.List<AccCerBodyGeneral> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body generals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyGeneralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body generals
	 * @param end the upper bound of the range of acc cer body generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body generals
	 */
	public java.util.List<AccCerBodyGeneral> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body general in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body general
	 * @throws NoSuchAccCerBodyGeneralException if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
				orderByComparator)
		throws NoSuchAccCerBodyGeneralException;

	/**
	 * Returns the first acc cer body general in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body general, or <code>null</code> if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
			orderByComparator);

	/**
	 * Returns the last acc cer body general in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body general
	 * @throws NoSuchAccCerBodyGeneralException if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
				orderByComparator)
		throws NoSuchAccCerBodyGeneralException;

	/**
	 * Returns the last acc cer body general in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body general, or <code>null</code> if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
			orderByComparator);

	/**
	 * Returns the acc cer body generals before and after the current acc cer body general in the ordered set where uuid = &#63;.
	 *
	 * @param accCerBodyGeneralId the primary key of the current acc cer body general
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body general
	 * @throws NoSuchAccCerBodyGeneralException if a acc cer body general with the primary key could not be found
	 */
	public AccCerBodyGeneral[] findByUuid_PrevAndNext(
			long accCerBodyGeneralId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
				orderByComparator)
		throws NoSuchAccCerBodyGeneralException;

	/**
	 * Removes all the acc cer body generals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc cer body generals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc cer body generals
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc cer body general where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccCerBodyGeneralException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body general
	 * @throws NoSuchAccCerBodyGeneralException if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral findByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyGeneralException;

	/**
	 * Returns the acc cer body general where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body general, or <code>null</code> if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc cer body general where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body general, or <code>null</code> if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc cer body general where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc cer body general that was removed
	 */
	public AccCerBodyGeneral removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyGeneralException;

	/**
	 * Returns the number of acc cer body generals where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc cer body generals
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc cer body generals where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc cer body generals
	 */
	public java.util.List<AccCerBodyGeneral> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc cer body generals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyGeneralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body generals
	 * @param end the upper bound of the range of acc cer body generals (not inclusive)
	 * @return the range of matching acc cer body generals
	 */
	public java.util.List<AccCerBodyGeneral> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body generals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyGeneralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body generals
	 * @param end the upper bound of the range of acc cer body generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body generals
	 */
	public java.util.List<AccCerBodyGeneral> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body generals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyGeneralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body generals
	 * @param end the upper bound of the range of acc cer body generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body generals
	 */
	public java.util.List<AccCerBodyGeneral> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body general in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body general
	 * @throws NoSuchAccCerBodyGeneralException if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
				orderByComparator)
		throws NoSuchAccCerBodyGeneralException;

	/**
	 * Returns the first acc cer body general in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body general, or <code>null</code> if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
			orderByComparator);

	/**
	 * Returns the last acc cer body general in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body general
	 * @throws NoSuchAccCerBodyGeneralException if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
				orderByComparator)
		throws NoSuchAccCerBodyGeneralException;

	/**
	 * Returns the last acc cer body general in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body general, or <code>null</code> if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
			orderByComparator);

	/**
	 * Returns the acc cer body generals before and after the current acc cer body general in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accCerBodyGeneralId the primary key of the current acc cer body general
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body general
	 * @throws NoSuchAccCerBodyGeneralException if a acc cer body general with the primary key could not be found
	 */
	public AccCerBodyGeneral[] findByUuid_C_PrevAndNext(
			long accCerBodyGeneralId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
				orderByComparator)
		throws NoSuchAccCerBodyGeneralException;

	/**
	 * Removes all the acc cer body generals where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc cer body generals where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc cer body generals
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc cer body general where janaacApplicationId = &#63; or throws a <code>NoSuchAccCerBodyGeneralException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body general
	 * @throws NoSuchAccCerBodyGeneralException if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyGeneralException;

	/**
	 * Returns the acc cer body general where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body general, or <code>null</code> if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc cer body general where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body general, or <code>null</code> if a matching acc cer body general could not be found
	 */
	public AccCerBodyGeneral fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc cer body general where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc cer body general that was removed
	 */
	public AccCerBodyGeneral removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyGeneralException;

	/**
	 * Returns the number of acc cer body generals where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc cer body generals
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc cer body general in the entity cache if it is enabled.
	 *
	 * @param accCerBodyGeneral the acc cer body general
	 */
	public void cacheResult(AccCerBodyGeneral accCerBodyGeneral);

	/**
	 * Caches the acc cer body generals in the entity cache if it is enabled.
	 *
	 * @param accCerBodyGenerals the acc cer body generals
	 */
	public void cacheResult(
		java.util.List<AccCerBodyGeneral> accCerBodyGenerals);

	/**
	 * Creates a new acc cer body general with the primary key. Does not add the acc cer body general to the database.
	 *
	 * @param accCerBodyGeneralId the primary key for the new acc cer body general
	 * @return the new acc cer body general
	 */
	public AccCerBodyGeneral create(long accCerBodyGeneralId);

	/**
	 * Removes the acc cer body general with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accCerBodyGeneralId the primary key of the acc cer body general
	 * @return the acc cer body general that was removed
	 * @throws NoSuchAccCerBodyGeneralException if a acc cer body general with the primary key could not be found
	 */
	public AccCerBodyGeneral remove(long accCerBodyGeneralId)
		throws NoSuchAccCerBodyGeneralException;

	public AccCerBodyGeneral updateImpl(AccCerBodyGeneral accCerBodyGeneral);

	/**
	 * Returns the acc cer body general with the primary key or throws a <code>NoSuchAccCerBodyGeneralException</code> if it could not be found.
	 *
	 * @param accCerBodyGeneralId the primary key of the acc cer body general
	 * @return the acc cer body general
	 * @throws NoSuchAccCerBodyGeneralException if a acc cer body general with the primary key could not be found
	 */
	public AccCerBodyGeneral findByPrimaryKey(long accCerBodyGeneralId)
		throws NoSuchAccCerBodyGeneralException;

	/**
	 * Returns the acc cer body general with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accCerBodyGeneralId the primary key of the acc cer body general
	 * @return the acc cer body general, or <code>null</code> if a acc cer body general with the primary key could not be found
	 */
	public AccCerBodyGeneral fetchByPrimaryKey(long accCerBodyGeneralId);

	/**
	 * Returns all the acc cer body generals.
	 *
	 * @return the acc cer body generals
	 */
	public java.util.List<AccCerBodyGeneral> findAll();

	/**
	 * Returns a range of all the acc cer body generals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyGeneralModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body generals
	 * @param end the upper bound of the range of acc cer body generals (not inclusive)
	 * @return the range of acc cer body generals
	 */
	public java.util.List<AccCerBodyGeneral> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body generals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyGeneralModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body generals
	 * @param end the upper bound of the range of acc cer body generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc cer body generals
	 */
	public java.util.List<AccCerBodyGeneral> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body generals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyGeneralModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body generals
	 * @param end the upper bound of the range of acc cer body generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc cer body generals
	 */
	public java.util.List<AccCerBodyGeneral> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyGeneral>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc cer body generals from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc cer body generals.
	 *
	 * @return the number of acc cer body generals
	 */
	public int countAll();

}