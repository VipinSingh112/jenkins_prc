/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCNoticeOfAppearanceException;
import com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc notice of appearance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCNoticeOfAppearanceUtil
 * @generated
 */
@ProviderType
public interface JADSCNoticeOfAppearancePersistence
	extends BasePersistence<JADSCNoticeOfAppearance> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JADSCNoticeOfAppearanceUtil} to access the jadsc notice of appearance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jadsc notice of appearances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc notice of appearances
	 */
	public java.util.List<JADSCNoticeOfAppearance> findByUuid(String uuid);

	/**
	 * Returns a range of all the jadsc notice of appearances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @return the range of matching jadsc notice of appearances
	 */
	public java.util.List<JADSCNoticeOfAppearance> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc notice of appearances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc notice of appearances
	 */
	public java.util.List<JADSCNoticeOfAppearance> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCNoticeOfAppearance> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc notice of appearances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc notice of appearances
	 */
	public java.util.List<JADSCNoticeOfAppearance> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCNoticeOfAppearance> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCNoticeOfAppearance> orderByComparator)
		throws NoSuchJADSCNoticeOfAppearanceException;

	/**
	 * Returns the first jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCNoticeOfAppearance> orderByComparator);

	/**
	 * Returns the last jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCNoticeOfAppearance> orderByComparator)
		throws NoSuchJADSCNoticeOfAppearanceException;

	/**
	 * Returns the last jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCNoticeOfAppearance> orderByComparator);

	/**
	 * Returns the jadsc notice of appearances before and after the current jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param jadscNOAId the primary key of the current jadsc notice of appearance
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	public JADSCNoticeOfAppearance[] findByUuid_PrevAndNext(
			long jadscNOAId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCNoticeOfAppearance> orderByComparator)
		throws NoSuchJADSCNoticeOfAppearanceException;

	/**
	 * Removes all the jadsc notice of appearances where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of jadsc notice of appearances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc notice of appearances
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the jadsc notice of appearance where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCNoticeOfAppearanceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCNoticeOfAppearanceException;

	/**
	 * Returns the jadsc notice of appearance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the jadsc notice of appearance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the jadsc notice of appearance where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc notice of appearance that was removed
	 */
	public JADSCNoticeOfAppearance removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCNoticeOfAppearanceException;

	/**
	 * Returns the number of jadsc notice of appearances where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc notice of appearances
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc notice of appearances
	 */
	public java.util.List<JADSCNoticeOfAppearance> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @return the range of matching jadsc notice of appearances
	 */
	public java.util.List<JADSCNoticeOfAppearance> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc notice of appearances
	 */
	public java.util.List<JADSCNoticeOfAppearance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCNoticeOfAppearance> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc notice of appearances
	 */
	public java.util.List<JADSCNoticeOfAppearance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCNoticeOfAppearance> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCNoticeOfAppearance> orderByComparator)
		throws NoSuchJADSCNoticeOfAppearanceException;

	/**
	 * Returns the first jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCNoticeOfAppearance> orderByComparator);

	/**
	 * Returns the last jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCNoticeOfAppearance> orderByComparator)
		throws NoSuchJADSCNoticeOfAppearanceException;

	/**
	 * Returns the last jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCNoticeOfAppearance> orderByComparator);

	/**
	 * Returns the jadsc notice of appearances before and after the current jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscNOAId the primary key of the current jadsc notice of appearance
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	public JADSCNoticeOfAppearance[] findByUuid_C_PrevAndNext(
			long jadscNOAId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JADSCNoticeOfAppearance> orderByComparator)
		throws NoSuchJADSCNoticeOfAppearanceException;

	/**
	 * Removes all the jadsc notice of appearances where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc notice of appearances
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the jadsc notice of appearance where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCNoticeOfAppearanceException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance findBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCNoticeOfAppearanceException;

	/**
	 * Returns the jadsc notice of appearance where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance fetchBygetJADSCById(long jadscApplicationId);

	/**
	 * Returns the jadsc notice of appearance where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public JADSCNoticeOfAppearance fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache);

	/**
	 * Removes the jadsc notice of appearance where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc notice of appearance that was removed
	 */
	public JADSCNoticeOfAppearance removeBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCNoticeOfAppearanceException;

	/**
	 * Returns the number of jadsc notice of appearances where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc notice of appearances
	 */
	public int countBygetJADSCById(long jadscApplicationId);

	/**
	 * Caches the jadsc notice of appearance in the entity cache if it is enabled.
	 *
	 * @param jadscNoticeOfAppearance the jadsc notice of appearance
	 */
	public void cacheResult(JADSCNoticeOfAppearance jadscNoticeOfAppearance);

	/**
	 * Caches the jadsc notice of appearances in the entity cache if it is enabled.
	 *
	 * @param jadscNoticeOfAppearances the jadsc notice of appearances
	 */
	public void cacheResult(
		java.util.List<JADSCNoticeOfAppearance> jadscNoticeOfAppearances);

	/**
	 * Creates a new jadsc notice of appearance with the primary key. Does not add the jadsc notice of appearance to the database.
	 *
	 * @param jadscNOAId the primary key for the new jadsc notice of appearance
	 * @return the new jadsc notice of appearance
	 */
	public JADSCNoticeOfAppearance create(long jadscNOAId);

	/**
	 * Removes the jadsc notice of appearance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscNOAId the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance that was removed
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	public JADSCNoticeOfAppearance remove(long jadscNOAId)
		throws NoSuchJADSCNoticeOfAppearanceException;

	public JADSCNoticeOfAppearance updateImpl(
		JADSCNoticeOfAppearance jadscNoticeOfAppearance);

	/**
	 * Returns the jadsc notice of appearance with the primary key or throws a <code>NoSuchJADSCNoticeOfAppearanceException</code> if it could not be found.
	 *
	 * @param jadscNOAId the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	public JADSCNoticeOfAppearance findByPrimaryKey(long jadscNOAId)
		throws NoSuchJADSCNoticeOfAppearanceException;

	/**
	 * Returns the jadsc notice of appearance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscNOAId the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance, or <code>null</code> if a jadsc notice of appearance with the primary key could not be found
	 */
	public JADSCNoticeOfAppearance fetchByPrimaryKey(long jadscNOAId);

	/**
	 * Returns all the jadsc notice of appearances.
	 *
	 * @return the jadsc notice of appearances
	 */
	public java.util.List<JADSCNoticeOfAppearance> findAll();

	/**
	 * Returns a range of all the jadsc notice of appearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @return the range of jadsc notice of appearances
	 */
	public java.util.List<JADSCNoticeOfAppearance> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jadsc notice of appearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc notice of appearances
	 */
	public java.util.List<JADSCNoticeOfAppearance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCNoticeOfAppearance> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc notice of appearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc notice of appearances
	 */
	public java.util.List<JADSCNoticeOfAppearance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JADSCNoticeOfAppearance> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc notice of appearances from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc notice of appearances.
	 *
	 * @return the number of jadsc notice of appearances
	 */
	public int countAll();

}