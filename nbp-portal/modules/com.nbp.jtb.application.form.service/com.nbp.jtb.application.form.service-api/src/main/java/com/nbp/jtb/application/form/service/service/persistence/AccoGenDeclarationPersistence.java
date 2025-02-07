/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAccoGenDeclarationException;
import com.nbp.jtb.application.form.service.model.AccoGenDeclaration;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acco gen declaration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoGenDeclarationUtil
 * @generated
 */
@ProviderType
public interface AccoGenDeclarationPersistence
	extends BasePersistence<AccoGenDeclaration> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccoGenDeclarationUtil} to access the acco gen declaration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acco gen declarations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acco gen declarations
	 */
	public java.util.List<AccoGenDeclaration> findByUuid(String uuid);

	/**
	 * Returns a range of all the acco gen declarations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @return the range of matching acco gen declarations
	 */
	public java.util.List<AccoGenDeclaration> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acco gen declarations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco gen declarations
	 */
	public java.util.List<AccoGenDeclaration> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco gen declarations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco gen declarations
	 */
	public java.util.List<AccoGenDeclaration> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acco gen declaration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
				orderByComparator)
		throws NoSuchAccoGenDeclarationException;

	/**
	 * Returns the first acco gen declaration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
			orderByComparator);

	/**
	 * Returns the last acco gen declaration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
				orderByComparator)
		throws NoSuchAccoGenDeclarationException;

	/**
	 * Returns the last acco gen declaration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
			orderByComparator);

	/**
	 * Returns the acco gen declarations before and after the current acco gen declaration in the ordered set where uuid = &#63;.
	 *
	 * @param accoGenDeclarationId the primary key of the current acco gen declaration
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a acco gen declaration with the primary key could not be found
	 */
	public AccoGenDeclaration[] findByUuid_PrevAndNext(
			long accoGenDeclarationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
				orderByComparator)
		throws NoSuchAccoGenDeclarationException;

	/**
	 * Removes all the acco gen declarations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acco gen declarations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acco gen declarations
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acco gen declaration where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccoGenDeclarationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration findByUUID_G(String uuid, long groupId)
		throws NoSuchAccoGenDeclarationException;

	/**
	 * Returns the acco gen declaration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acco gen declaration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acco gen declaration where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acco gen declaration that was removed
	 */
	public AccoGenDeclaration removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccoGenDeclarationException;

	/**
	 * Returns the number of acco gen declarations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acco gen declarations
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acco gen declarations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acco gen declarations
	 */
	public java.util.List<AccoGenDeclaration> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acco gen declarations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @return the range of matching acco gen declarations
	 */
	public java.util.List<AccoGenDeclaration> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acco gen declarations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco gen declarations
	 */
	public java.util.List<AccoGenDeclaration> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco gen declarations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco gen declarations
	 */
	public java.util.List<AccoGenDeclaration> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acco gen declaration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
				orderByComparator)
		throws NoSuchAccoGenDeclarationException;

	/**
	 * Returns the first acco gen declaration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
			orderByComparator);

	/**
	 * Returns the last acco gen declaration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
				orderByComparator)
		throws NoSuchAccoGenDeclarationException;

	/**
	 * Returns the last acco gen declaration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
			orderByComparator);

	/**
	 * Returns the acco gen declarations before and after the current acco gen declaration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accoGenDeclarationId the primary key of the current acco gen declaration
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a acco gen declaration with the primary key could not be found
	 */
	public AccoGenDeclaration[] findByUuid_C_PrevAndNext(
			long accoGenDeclarationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
				orderByComparator)
		throws NoSuchAccoGenDeclarationException;

	/**
	 * Removes all the acco gen declarations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acco gen declarations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acco gen declarations
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acco gen declaration where jtbApplicationId = &#63; or throws a <code>NoSuchAccoGenDeclarationException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoGenDeclarationException;

	/**
	 * Returns the acco gen declaration where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the acco gen declaration where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	public AccoGenDeclaration fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the acco gen declaration where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco gen declaration that was removed
	 */
	public AccoGenDeclaration removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoGenDeclarationException;

	/**
	 * Returns the number of acco gen declarations where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco gen declarations
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the acco gen declaration in the entity cache if it is enabled.
	 *
	 * @param accoGenDeclaration the acco gen declaration
	 */
	public void cacheResult(AccoGenDeclaration accoGenDeclaration);

	/**
	 * Caches the acco gen declarations in the entity cache if it is enabled.
	 *
	 * @param accoGenDeclarations the acco gen declarations
	 */
	public void cacheResult(
		java.util.List<AccoGenDeclaration> accoGenDeclarations);

	/**
	 * Creates a new acco gen declaration with the primary key. Does not add the acco gen declaration to the database.
	 *
	 * @param accoGenDeclarationId the primary key for the new acco gen declaration
	 * @return the new acco gen declaration
	 */
	public AccoGenDeclaration create(long accoGenDeclarationId);

	/**
	 * Removes the acco gen declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoGenDeclarationId the primary key of the acco gen declaration
	 * @return the acco gen declaration that was removed
	 * @throws NoSuchAccoGenDeclarationException if a acco gen declaration with the primary key could not be found
	 */
	public AccoGenDeclaration remove(long accoGenDeclarationId)
		throws NoSuchAccoGenDeclarationException;

	public AccoGenDeclaration updateImpl(AccoGenDeclaration accoGenDeclaration);

	/**
	 * Returns the acco gen declaration with the primary key or throws a <code>NoSuchAccoGenDeclarationException</code> if it could not be found.
	 *
	 * @param accoGenDeclarationId the primary key of the acco gen declaration
	 * @return the acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a acco gen declaration with the primary key could not be found
	 */
	public AccoGenDeclaration findByPrimaryKey(long accoGenDeclarationId)
		throws NoSuchAccoGenDeclarationException;

	/**
	 * Returns the acco gen declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoGenDeclarationId the primary key of the acco gen declaration
	 * @return the acco gen declaration, or <code>null</code> if a acco gen declaration with the primary key could not be found
	 */
	public AccoGenDeclaration fetchByPrimaryKey(long accoGenDeclarationId);

	/**
	 * Returns all the acco gen declarations.
	 *
	 * @return the acco gen declarations
	 */
	public java.util.List<AccoGenDeclaration> findAll();

	/**
	 * Returns a range of all the acco gen declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @return the range of acco gen declarations
	 */
	public java.util.List<AccoGenDeclaration> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acco gen declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco gen declarations
	 */
	public java.util.List<AccoGenDeclaration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco gen declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco gen declarations
	 */
	public java.util.List<AccoGenDeclaration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoGenDeclaration>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acco gen declarations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acco gen declarations.
	 *
	 * @return the number of acco gen declarations
	 */
	public int countAll();

}