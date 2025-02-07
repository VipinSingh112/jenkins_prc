/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.entity.information.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.entity.information.services.exception.NoSuchEntityInformationException;
import com.nbp.entity.information.services.model.EntityInformation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the entity information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityInformationUtil
 * @generated
 */
@ProviderType
public interface EntityInformationPersistence
	extends BasePersistence<EntityInformation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EntityInformationUtil} to access the entity information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the entity informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity informations
	 */
	public java.util.List<EntityInformation> findByUuid(String uuid);

	/**
	 * Returns a range of all the entity informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @return the range of matching entity informations
	 */
	public java.util.List<EntityInformation> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the entity informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity informations
	 */
	public java.util.List<EntityInformation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the entity informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity informations
	 */
	public java.util.List<EntityInformation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first entity information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity information
	 * @throws NoSuchEntityInformationException if a matching entity information could not be found
	 */
	public EntityInformation findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
				orderByComparator)
		throws NoSuchEntityInformationException;

	/**
	 * Returns the first entity information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public EntityInformation fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
			orderByComparator);

	/**
	 * Returns the last entity information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity information
	 * @throws NoSuchEntityInformationException if a matching entity information could not be found
	 */
	public EntityInformation findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
				orderByComparator)
		throws NoSuchEntityInformationException;

	/**
	 * Returns the last entity information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public EntityInformation fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
			orderByComparator);

	/**
	 * Returns the entity informations before and after the current entity information in the ordered set where uuid = &#63;.
	 *
	 * @param entityInfoId the primary key of the current entity information
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity information
	 * @throws NoSuchEntityInformationException if a entity information with the primary key could not be found
	 */
	public EntityInformation[] findByUuid_PrevAndNext(
			long entityInfoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
				orderByComparator)
		throws NoSuchEntityInformationException;

	/**
	 * Removes all the entity informations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of entity informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity informations
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the entity information where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEntityInformationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching entity information
	 * @throws NoSuchEntityInformationException if a matching entity information could not be found
	 */
	public EntityInformation findByUUID_G(String uuid, long groupId)
		throws NoSuchEntityInformationException;

	/**
	 * Returns the entity information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public EntityInformation fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the entity information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public EntityInformation fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the entity information where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the entity information that was removed
	 */
	public EntityInformation removeByUUID_G(String uuid, long groupId)
		throws NoSuchEntityInformationException;

	/**
	 * Returns the number of entity informations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching entity informations
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the entity informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching entity informations
	 */
	public java.util.List<EntityInformation> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the entity informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @return the range of matching entity informations
	 */
	public java.util.List<EntityInformation> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the entity informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity informations
	 */
	public java.util.List<EntityInformation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the entity informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity informations
	 */
	public java.util.List<EntityInformation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first entity information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity information
	 * @throws NoSuchEntityInformationException if a matching entity information could not be found
	 */
	public EntityInformation findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
				orderByComparator)
		throws NoSuchEntityInformationException;

	/**
	 * Returns the first entity information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public EntityInformation fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
			orderByComparator);

	/**
	 * Returns the last entity information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity information
	 * @throws NoSuchEntityInformationException if a matching entity information could not be found
	 */
	public EntityInformation findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
				orderByComparator)
		throws NoSuchEntityInformationException;

	/**
	 * Returns the last entity information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public EntityInformation fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
			orderByComparator);

	/**
	 * Returns the entity informations before and after the current entity information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param entityInfoId the primary key of the current entity information
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity information
	 * @throws NoSuchEntityInformationException if a entity information with the primary key could not be found
	 */
	public EntityInformation[] findByUuid_C_PrevAndNext(
			long entityInfoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
				orderByComparator)
		throws NoSuchEntityInformationException;

	/**
	 * Removes all the entity informations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of entity informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching entity informations
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the entity information where entityNumber = &#63; or throws a <code>NoSuchEntityInformationException</code> if it could not be found.
	 *
	 * @param entityNumber the entity number
	 * @return the matching entity information
	 * @throws NoSuchEntityInformationException if a matching entity information could not be found
	 */
	public EntityInformation findByentityNumber(String entityNumber)
		throws NoSuchEntityInformationException;

	/**
	 * Returns the entity information where entityNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityNumber the entity number
	 * @return the matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public EntityInformation fetchByentityNumber(String entityNumber);

	/**
	 * Returns the entity information where entityNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityNumber the entity number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public EntityInformation fetchByentityNumber(
		String entityNumber, boolean useFinderCache);

	/**
	 * Removes the entity information where entityNumber = &#63; from the database.
	 *
	 * @param entityNumber the entity number
	 * @return the entity information that was removed
	 */
	public EntityInformation removeByentityNumber(String entityNumber)
		throws NoSuchEntityInformationException;

	/**
	 * Returns the number of entity informations where entityNumber = &#63;.
	 *
	 * @param entityNumber the entity number
	 * @return the number of matching entity informations
	 */
	public int countByentityNumber(String entityNumber);

	/**
	 * Caches the entity information in the entity cache if it is enabled.
	 *
	 * @param entityInformation the entity information
	 */
	public void cacheResult(EntityInformation entityInformation);

	/**
	 * Caches the entity informations in the entity cache if it is enabled.
	 *
	 * @param entityInformations the entity informations
	 */
	public void cacheResult(
		java.util.List<EntityInformation> entityInformations);

	/**
	 * Creates a new entity information with the primary key. Does not add the entity information to the database.
	 *
	 * @param entityInfoId the primary key for the new entity information
	 * @return the new entity information
	 */
	public EntityInformation create(long entityInfoId);

	/**
	 * Removes the entity information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entityInfoId the primary key of the entity information
	 * @return the entity information that was removed
	 * @throws NoSuchEntityInformationException if a entity information with the primary key could not be found
	 */
	public EntityInformation remove(long entityInfoId)
		throws NoSuchEntityInformationException;

	public EntityInformation updateImpl(EntityInformation entityInformation);

	/**
	 * Returns the entity information with the primary key or throws a <code>NoSuchEntityInformationException</code> if it could not be found.
	 *
	 * @param entityInfoId the primary key of the entity information
	 * @return the entity information
	 * @throws NoSuchEntityInformationException if a entity information with the primary key could not be found
	 */
	public EntityInformation findByPrimaryKey(long entityInfoId)
		throws NoSuchEntityInformationException;

	/**
	 * Returns the entity information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param entityInfoId the primary key of the entity information
	 * @return the entity information, or <code>null</code> if a entity information with the primary key could not be found
	 */
	public EntityInformation fetchByPrimaryKey(long entityInfoId);

	/**
	 * Returns all the entity informations.
	 *
	 * @return the entity informations
	 */
	public java.util.List<EntityInformation> findAll();

	/**
	 * Returns a range of all the entity informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @return the range of entity informations
	 */
	public java.util.List<EntityInformation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the entity informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of entity informations
	 */
	public java.util.List<EntityInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the entity informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of entity informations
	 */
	public java.util.List<EntityInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EntityInformation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the entity informations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of entity informations.
	 *
	 * @return the number of entity informations
	 */
	public int countAll();

}