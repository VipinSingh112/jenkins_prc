/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.quary.application.form.service.exception.NoSuchQuarryApplicationMachinesAndEquipmentException;
import com.nbp.quary.application.form.service.model.QuarryApplicationMachinesAndEquipment;
import com.nbp.quary.application.form.service.model.QuarryApplicationMachinesAndEquipmentTable;
import com.nbp.quary.application.form.service.model.impl.QuarryApplicationMachinesAndEquipmentImpl;
import com.nbp.quary.application.form.service.model.impl.QuarryApplicationMachinesAndEquipmentModelImpl;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationMachinesAndEquipmentPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationMachinesAndEquipmentUtil;
import com.nbp.quary.application.form.service.service.persistence.impl.constants.QUARRY_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the quarry application machines and equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryApplicationMachinesAndEquipmentPersistence.class)
public class QuarryApplicationMachinesAndEquipmentPersistenceImpl
	extends BasePersistenceImpl<QuarryApplicationMachinesAndEquipment>
	implements QuarryApplicationMachinesAndEquipmentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryApplicationMachinesAndEquipmentUtil</code> to access the quarry application machines and equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryApplicationMachinesAndEquipmentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the quarry application machines and equipments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry application machines and equipments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @return the range of matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<QuarryApplicationMachinesAndEquipment> list = null;

		if (useFinderCache) {
			list =
				(List<QuarryApplicationMachinesAndEquipment>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplicationMachinesAndEquipment
						quarryApplicationMachinesAndEquipment : list) {

					if (!uuid.equals(
							quarryApplicationMachinesAndEquipment.getUuid())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					QuarryApplicationMachinesAndEquipmentModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list =
					(List<QuarryApplicationMachinesAndEquipment>)QueryUtil.list(
						query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment findByUuid_First(
			String uuid,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment = fetchByUuid_First(
				uuid, orderByComparator);

		if (quarryApplicationMachinesAndEquipment != null) {
			return quarryApplicationMachinesAndEquipment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchQuarryApplicationMachinesAndEquipmentException(
			sb.toString());
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment fetchByUuid_First(
		String uuid,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		List<QuarryApplicationMachinesAndEquipment> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment findByUuid_Last(
			String uuid,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment = fetchByUuid_Last(
				uuid, orderByComparator);

		if (quarryApplicationMachinesAndEquipment != null) {
			return quarryApplicationMachinesAndEquipment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchQuarryApplicationMachinesAndEquipmentException(
			sb.toString());
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment fetchByUuid_Last(
		String uuid,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<QuarryApplicationMachinesAndEquipment> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry application machines and equipments before and after the current quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param quarryApplicationMachinId the primary key of the current quarry application machines and equipment
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment[] findByUuid_PrevAndNext(
			long quarryApplicationMachinId, String uuid,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		uuid = Objects.toString(uuid, "");

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment = findByPrimaryKey(
				quarryApplicationMachinId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplicationMachinesAndEquipment[] array =
				new QuarryApplicationMachinesAndEquipmentImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, quarryApplicationMachinesAndEquipment, uuid,
				orderByComparator, true);

			array[1] = quarryApplicationMachinesAndEquipment;

			array[2] = getByUuid_PrevAndNext(
				session, quarryApplicationMachinesAndEquipment, uuid,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryApplicationMachinesAndEquipment getByUuid_PrevAndNext(
		Session session,
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment,
		String uuid,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(
				QuarryApplicationMachinesAndEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryApplicationMachinesAndEquipment)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplicationMachinesAndEquipment> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry application machines and equipments where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment :
					findByUuid(
						uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(quarryApplicationMachinesAndEquipment);
		}
	}

	/**
	 * Returns the number of quarry application machines and equipments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching quarry application machines and equipments
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"quarryApplicationMachinesAndEquipment.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(quarryApplicationMachinesAndEquipment.uuid IS NULL OR quarryApplicationMachinesAndEquipment.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the quarry application machines and equipment where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQuarryApplicationMachinesAndEquipmentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment findByUUID_G(
			String uuid, long groupId)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment = fetchByUUID_G(
				uuid, groupId);

		if (quarryApplicationMachinesAndEquipment == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryApplicationMachinesAndEquipmentException(
				sb.toString());
		}

		return quarryApplicationMachinesAndEquipment;
	}

	/**
	 * Returns the quarry application machines and equipment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the quarry application machines and equipment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof QuarryApplicationMachinesAndEquipment) {
			QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment =
					(QuarryApplicationMachinesAndEquipment)result;

			if (!Objects.equals(
					uuid, quarryApplicationMachinesAndEquipment.getUuid()) ||
				(groupId !=
					quarryApplicationMachinesAndEquipment.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<QuarryApplicationMachinesAndEquipment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					QuarryApplicationMachinesAndEquipment
						quarryApplicationMachinesAndEquipment = list.get(0);

					result = quarryApplicationMachinesAndEquipment;

					cacheResult(quarryApplicationMachinesAndEquipment);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (QuarryApplicationMachinesAndEquipment)result;
		}
	}

	/**
	 * Removes the quarry application machines and equipment where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the quarry application machines and equipment that was removed
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment = findByUUID_G(uuid, groupId);

		return remove(quarryApplicationMachinesAndEquipment);
	}

	/**
	 * Returns the number of quarry application machines and equipments where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching quarry application machines and equipments
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"quarryApplicationMachinesAndEquipment.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(quarryApplicationMachinesAndEquipment.uuid IS NULL OR quarryApplicationMachinesAndEquipment.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"quarryApplicationMachinesAndEquipment.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the quarry application machines and equipments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry application machines and equipments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @return the range of matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<QuarryApplicationMachinesAndEquipment> list = null;

		if (useFinderCache) {
			list =
				(List<QuarryApplicationMachinesAndEquipment>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplicationMachinesAndEquipment
						quarryApplicationMachinesAndEquipment : list) {

					if (!uuid.equals(
							quarryApplicationMachinesAndEquipment.getUuid()) ||
						(companyId !=
							quarryApplicationMachinesAndEquipment.
								getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					QuarryApplicationMachinesAndEquipmentModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list =
					(List<QuarryApplicationMachinesAndEquipment>)QueryUtil.list(
						query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment = fetchByUuid_C_First(
				uuid, companyId, orderByComparator);

		if (quarryApplicationMachinesAndEquipment != null) {
			return quarryApplicationMachinesAndEquipment;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchQuarryApplicationMachinesAndEquipmentException(
			sb.toString());
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		List<QuarryApplicationMachinesAndEquipment> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment = fetchByUuid_C_Last(
				uuid, companyId, orderByComparator);

		if (quarryApplicationMachinesAndEquipment != null) {
			return quarryApplicationMachinesAndEquipment;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchQuarryApplicationMachinesAndEquipmentException(
			sb.toString());
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<QuarryApplicationMachinesAndEquipment> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry application machines and equipments before and after the current quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param quarryApplicationMachinId the primary key of the current quarry application machines and equipment
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment[] findByUuid_C_PrevAndNext(
			long quarryApplicationMachinId, String uuid, long companyId,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		uuid = Objects.toString(uuid, "");

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment = findByPrimaryKey(
				quarryApplicationMachinId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplicationMachinesAndEquipment[] array =
				new QuarryApplicationMachinesAndEquipmentImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, quarryApplicationMachinesAndEquipment, uuid, companyId,
				orderByComparator, true);

			array[1] = quarryApplicationMachinesAndEquipment;

			array[2] = getByUuid_C_PrevAndNext(
				session, quarryApplicationMachinesAndEquipment, uuid, companyId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryApplicationMachinesAndEquipment getByUuid_C_PrevAndNext(
		Session session,
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment,
		String uuid, long companyId,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(
				QuarryApplicationMachinesAndEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryApplicationMachinesAndEquipment)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplicationMachinesAndEquipment> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry application machines and equipments where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment :
					findByUuid_C(
						uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
						null)) {

			remove(quarryApplicationMachinesAndEquipment);
		}
	}

	/**
	 * Returns the number of quarry application machines and equipments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching quarry application machines and equipments
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"quarryApplicationMachinesAndEquipment.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(quarryApplicationMachinesAndEquipment.uuid IS NULL OR quarryApplicationMachinesAndEquipment.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"quarryApplicationMachinesAndEquipment.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetQuarryById;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarryById;
	private FinderPath _finderPathCountBygetQuarryById;

	/**
	 * Returns all the quarry application machines and equipments where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findBygetQuarryById(
		String quarryApplicationId) {

		return findBygetQuarryById(
			quarryApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry application machines and equipments where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @return the range of matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findBygetQuarryById(
		String quarryApplicationId, int start, int end) {

		return findBygetQuarryById(quarryApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findBygetQuarryById(
		String quarryApplicationId, int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		return findBygetQuarryById(
			quarryApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findBygetQuarryById(
		String quarryApplicationId, int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator,
		boolean useFinderCache) {

		quarryApplicationId = Objects.toString(quarryApplicationId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetQuarryById;
				finderArgs = new Object[] {quarryApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarryById;
			finderArgs = new Object[] {
				quarryApplicationId, start, end, orderByComparator
			};
		}

		List<QuarryApplicationMachinesAndEquipment> list = null;

		if (useFinderCache) {
			list =
				(List<QuarryApplicationMachinesAndEquipment>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplicationMachinesAndEquipment
						quarryApplicationMachinesAndEquipment : list) {

					if (!quarryApplicationId.equals(
							quarryApplicationMachinesAndEquipment.
								getQuarryApplicationId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

			boolean bindQuarryApplicationId = false;

			if (quarryApplicationId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_3);
			}
			else {
				bindQuarryApplicationId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					QuarryApplicationMachinesAndEquipmentModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindQuarryApplicationId) {
					queryPos.add(quarryApplicationId);
				}

				list =
					(List<QuarryApplicationMachinesAndEquipment>)QueryUtil.list(
						query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment findBygetQuarryById_First(
			String quarryApplicationId,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment = fetchBygetQuarryById_First(
				quarryApplicationId, orderByComparator);

		if (quarryApplicationMachinesAndEquipment != null) {
			return quarryApplicationMachinesAndEquipment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append("}");

		throw new NoSuchQuarryApplicationMachinesAndEquipmentException(
			sb.toString());
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment fetchBygetQuarryById_First(
		String quarryApplicationId,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		List<QuarryApplicationMachinesAndEquipment> list = findBygetQuarryById(
			quarryApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment findBygetQuarryById_Last(
			String quarryApplicationId,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment = fetchBygetQuarryById_Last(
				quarryApplicationId, orderByComparator);

		if (quarryApplicationMachinesAndEquipment != null) {
			return quarryApplicationMachinesAndEquipment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append("}");

		throw new NoSuchQuarryApplicationMachinesAndEquipmentException(
			sb.toString());
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment fetchBygetQuarryById_Last(
		String quarryApplicationId,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		int count = countBygetQuarryById(quarryApplicationId);

		if (count == 0) {
			return null;
		}

		List<QuarryApplicationMachinesAndEquipment> list = findBygetQuarryById(
			quarryApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry application machines and equipments before and after the current quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationMachinId the primary key of the current quarry application machines and equipment
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment[]
			findBygetQuarryById_PrevAndNext(
				long quarryApplicationMachinId, String quarryApplicationId,
				OrderByComparator<QuarryApplicationMachinesAndEquipment>
					orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		quarryApplicationId = Objects.toString(quarryApplicationId, "");

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment = findByPrimaryKey(
				quarryApplicationMachinId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplicationMachinesAndEquipment[] array =
				new QuarryApplicationMachinesAndEquipmentImpl[3];

			array[0] = getBygetQuarryById_PrevAndNext(
				session, quarryApplicationMachinesAndEquipment,
				quarryApplicationId, orderByComparator, true);

			array[1] = quarryApplicationMachinesAndEquipment;

			array[2] = getBygetQuarryById_PrevAndNext(
				session, quarryApplicationMachinesAndEquipment,
				quarryApplicationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryApplicationMachinesAndEquipment
		getBygetQuarryById_PrevAndNext(
			Session session,
			QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment,
			String quarryApplicationId,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

		boolean bindQuarryApplicationId = false;

		if (quarryApplicationId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_3);
		}
		else {
			bindQuarryApplicationId = true;

			sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(
				QuarryApplicationMachinesAndEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindQuarryApplicationId) {
			queryPos.add(quarryApplicationId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryApplicationMachinesAndEquipment)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplicationMachinesAndEquipment> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry application machines and equipments where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	@Override
	public void removeBygetQuarryById(String quarryApplicationId) {
		for (QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment :
					findBygetQuarryById(
						quarryApplicationId, QueryUtil.ALL_POS,
						QueryUtil.ALL_POS, null)) {

			remove(quarryApplicationMachinesAndEquipment);
		}
	}

	/**
	 * Returns the number of quarry application machines and equipments where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry application machines and equipments
	 */
	@Override
	public int countBygetQuarryById(String quarryApplicationId) {
		quarryApplicationId = Objects.toString(quarryApplicationId, "");

		FinderPath finderPath = _finderPathCountBygetQuarryById;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

			boolean bindQuarryApplicationId = false;

			if (quarryApplicationId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_3);
			}
			else {
				bindQuarryApplicationId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindQuarryApplicationId) {
					queryPos.add(quarryApplicationId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_2 =
			"quarryApplicationMachinesAndEquipment.quarryApplicationId = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_3 =
			"(quarryApplicationMachinesAndEquipment.quarryApplicationId IS NULL OR quarryApplicationMachinesAndEquipment.quarryApplicationId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetQuarryMAchineEquipment_By_MachineName_AppId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetQuarryMAchineEquipment_By_MachineName_AppId;
	private FinderPath
		_finderPathCountBygetQuarryMAchineEquipment_By_MachineName_AppId;

	/**
	 * Returns all the quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @return the matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName) {

		return findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			quarryApplicationId, manchineName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @return the range of matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start,
			int end) {

		return findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			quarryApplicationId, manchineName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start, int end,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator) {

		return findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			quarryApplicationId, manchineName, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start, int end,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator,
			boolean useFinderCache) {

		quarryApplicationId = Objects.toString(quarryApplicationId, "");
		manchineName = Objects.toString(manchineName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetQuarryMAchineEquipment_By_MachineName_AppId;
				finderArgs = new Object[] {quarryApplicationId, manchineName};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetQuarryMAchineEquipment_By_MachineName_AppId;
			finderArgs = new Object[] {
				quarryApplicationId, manchineName, start, end, orderByComparator
			};
		}

		List<QuarryApplicationMachinesAndEquipment> list = null;

		if (useFinderCache) {
			list =
				(List<QuarryApplicationMachinesAndEquipment>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplicationMachinesAndEquipment
						quarryApplicationMachinesAndEquipment : list) {

					if (!quarryApplicationId.equals(
							quarryApplicationMachinesAndEquipment.
								getQuarryApplicationId()) ||
						!manchineName.equals(
							quarryApplicationMachinesAndEquipment.
								getManchineName())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

			boolean bindQuarryApplicationId = false;

			if (quarryApplicationId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_3);
			}
			else {
				bindQuarryApplicationId = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_2);
			}

			boolean bindManchineName = false;

			if (manchineName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_3);
			}
			else {
				bindManchineName = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					QuarryApplicationMachinesAndEquipmentModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindQuarryApplicationId) {
					queryPos.add(quarryApplicationId);
				}

				if (bindManchineName) {
					queryPos.add(manchineName);
				}

				list =
					(List<QuarryApplicationMachinesAndEquipment>)QueryUtil.list(
						query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment
			findBygetQuarryMAchineEquipment_By_MachineName_AppId_First(
				String quarryApplicationId, String manchineName,
				OrderByComparator<QuarryApplicationMachinesAndEquipment>
					orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment =
				fetchBygetQuarryMAchineEquipment_By_MachineName_AppId_First(
					quarryApplicationId, manchineName, orderByComparator);

		if (quarryApplicationMachinesAndEquipment != null) {
			return quarryApplicationMachinesAndEquipment;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append(", manchineName=");
		sb.append(manchineName);

		sb.append("}");

		throw new NoSuchQuarryApplicationMachinesAndEquipmentException(
			sb.toString());
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment
		fetchBygetQuarryMAchineEquipment_By_MachineName_AppId_First(
			String quarryApplicationId, String manchineName,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator) {

		List<QuarryApplicationMachinesAndEquipment> list =
			findBygetQuarryMAchineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment
			findBygetQuarryMAchineEquipment_By_MachineName_AppId_Last(
				String quarryApplicationId, String manchineName,
				OrderByComparator<QuarryApplicationMachinesAndEquipment>
					orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment =
				fetchBygetQuarryMAchineEquipment_By_MachineName_AppId_Last(
					quarryApplicationId, manchineName, orderByComparator);

		if (quarryApplicationMachinesAndEquipment != null) {
			return quarryApplicationMachinesAndEquipment;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append(", manchineName=");
		sb.append(manchineName);

		sb.append("}");

		throw new NoSuchQuarryApplicationMachinesAndEquipmentException(
			sb.toString());
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment
		fetchBygetQuarryMAchineEquipment_By_MachineName_AppId_Last(
			String quarryApplicationId, String manchineName,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator) {

		int count = countBygetQuarryMAchineEquipment_By_MachineName_AppId(
			quarryApplicationId, manchineName);

		if (count == 0) {
			return null;
		}

		List<QuarryApplicationMachinesAndEquipment> list =
			findBygetQuarryMAchineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry application machines and equipments before and after the current quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationMachinId the primary key of the current quarry application machines and equipment
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment[]
			findBygetQuarryMAchineEquipment_By_MachineName_AppId_PrevAndNext(
				long quarryApplicationMachinId, String quarryApplicationId,
				String manchineName,
				OrderByComparator<QuarryApplicationMachinesAndEquipment>
					orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		quarryApplicationId = Objects.toString(quarryApplicationId, "");
		manchineName = Objects.toString(manchineName, "");

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment = findByPrimaryKey(
				quarryApplicationMachinId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplicationMachinesAndEquipment[] array =
				new QuarryApplicationMachinesAndEquipmentImpl[3];

			array[0] =
				getBygetQuarryMAchineEquipment_By_MachineName_AppId_PrevAndNext(
					session, quarryApplicationMachinesAndEquipment,
					quarryApplicationId, manchineName, orderByComparator, true);

			array[1] = quarryApplicationMachinesAndEquipment;

			array[2] =
				getBygetQuarryMAchineEquipment_By_MachineName_AppId_PrevAndNext(
					session, quarryApplicationMachinesAndEquipment,
					quarryApplicationId, manchineName, orderByComparator,
					false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryApplicationMachinesAndEquipment
		getBygetQuarryMAchineEquipment_By_MachineName_AppId_PrevAndNext(
			Session session,
			QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment,
			String quarryApplicationId, String manchineName,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

		boolean bindQuarryApplicationId = false;

		if (quarryApplicationId.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_3);
		}
		else {
			bindQuarryApplicationId = true;

			sb.append(
				_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_2);
		}

		boolean bindManchineName = false;

		if (manchineName.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_3);
		}
		else {
			bindManchineName = true;

			sb.append(
				_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(
				QuarryApplicationMachinesAndEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindQuarryApplicationId) {
			queryPos.add(quarryApplicationId);
		}

		if (bindManchineName) {
			queryPos.add(manchineName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryApplicationMachinesAndEquipment)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplicationMachinesAndEquipment> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 */
	@Override
	public void removeBygetQuarryMAchineEquipment_By_MachineName_AppId(
		String quarryApplicationId, String manchineName) {

		for (QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment :
					findBygetQuarryMAchineEquipment_By_MachineName_AppId(
						quarryApplicationId, manchineName, QueryUtil.ALL_POS,
						QueryUtil.ALL_POS, null)) {

			remove(quarryApplicationMachinesAndEquipment);
		}
	}

	/**
	 * Returns the number of quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @return the number of matching quarry application machines and equipments
	 */
	@Override
	public int countBygetQuarryMAchineEquipment_By_MachineName_AppId(
		String quarryApplicationId, String manchineName) {

		quarryApplicationId = Objects.toString(quarryApplicationId, "");
		manchineName = Objects.toString(manchineName, "");

		FinderPath finderPath =
			_finderPathCountBygetQuarryMAchineEquipment_By_MachineName_AppId;

		Object[] finderArgs = new Object[] {quarryApplicationId, manchineName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE);

			boolean bindQuarryApplicationId = false;

			if (quarryApplicationId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_3);
			}
			else {
				bindQuarryApplicationId = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_2);
			}

			boolean bindManchineName = false;

			if (manchineName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_3);
			}
			else {
				bindManchineName = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindQuarryApplicationId) {
					queryPos.add(quarryApplicationId);
				}

				if (bindManchineName) {
					queryPos.add(manchineName);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_2 =
			"quarryApplicationMachinesAndEquipment.quarryApplicationId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_3 =
			"(quarryApplicationMachinesAndEquipment.quarryApplicationId IS NULL OR quarryApplicationMachinesAndEquipment.quarryApplicationId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_2 =
			"quarryApplicationMachinesAndEquipment.manchineName = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRYMACHINEEQUIPMENT_BY_MACHINENAME_APPID_MANCHINENAME_3 =
			"(quarryApplicationMachinesAndEquipment.manchineName IS NULL OR quarryApplicationMachinesAndEquipment.manchineName = '')";

	public QuarryApplicationMachinesAndEquipmentPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(QuarryApplicationMachinesAndEquipment.class);

		setModelImplClass(QuarryApplicationMachinesAndEquipmentImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryApplicationMachinesAndEquipmentTable.INSTANCE);
	}

	/**
	 * Caches the quarry application machines and equipment in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationMachinesAndEquipment the quarry application machines and equipment
	 */
	@Override
	public void cacheResult(
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment) {

		entityCache.putResult(
			QuarryApplicationMachinesAndEquipmentImpl.class,
			quarryApplicationMachinesAndEquipment.getPrimaryKey(),
			quarryApplicationMachinesAndEquipment);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				quarryApplicationMachinesAndEquipment.getUuid(),
				quarryApplicationMachinesAndEquipment.getGroupId()
			},
			quarryApplicationMachinesAndEquipment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry application machines and equipments in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationMachinesAndEquipments the quarry application machines and equipments
	 */
	@Override
	public void cacheResult(
		List<QuarryApplicationMachinesAndEquipment>
			quarryApplicationMachinesAndEquipments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryApplicationMachinesAndEquipments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment :
					quarryApplicationMachinesAndEquipments) {

			if (entityCache.getResult(
					QuarryApplicationMachinesAndEquipmentImpl.class,
					quarryApplicationMachinesAndEquipment.getPrimaryKey()) ==
						null) {

				cacheResult(quarryApplicationMachinesAndEquipment);
			}
		}
	}

	/**
	 * Clears the cache for all quarry application machines and equipments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuarryApplicationMachinesAndEquipmentImpl.class);

		finderCache.clearCache(QuarryApplicationMachinesAndEquipmentImpl.class);
	}

	/**
	 * Clears the cache for the quarry application machines and equipment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment) {

		entityCache.removeResult(
			QuarryApplicationMachinesAndEquipmentImpl.class,
			quarryApplicationMachinesAndEquipment);
	}

	@Override
	public void clearCache(
		List<QuarryApplicationMachinesAndEquipment>
			quarryApplicationMachinesAndEquipments) {

		for (QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment :
					quarryApplicationMachinesAndEquipments) {

			entityCache.removeResult(
				QuarryApplicationMachinesAndEquipmentImpl.class,
				quarryApplicationMachinesAndEquipment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QuarryApplicationMachinesAndEquipmentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QuarryApplicationMachinesAndEquipmentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QuarryApplicationMachinesAndEquipmentModelImpl
			quarryApplicationMachinesAndEquipmentModelImpl) {

		Object[] args = new Object[] {
			quarryApplicationMachinesAndEquipmentModelImpl.getUuid(),
			quarryApplicationMachinesAndEquipmentModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			quarryApplicationMachinesAndEquipmentModelImpl);
	}

	/**
	 * Creates a new quarry application machines and equipment with the primary key. Does not add the quarry application machines and equipment to the database.
	 *
	 * @param quarryApplicationMachinId the primary key for the new quarry application machines and equipment
	 * @return the new quarry application machines and equipment
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment create(
		long quarryApplicationMachinId) {

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment =
				new QuarryApplicationMachinesAndEquipmentImpl();

		quarryApplicationMachinesAndEquipment.setNew(true);
		quarryApplicationMachinesAndEquipment.setPrimaryKey(
			quarryApplicationMachinId);

		String uuid = PortalUUIDUtil.generate();

		quarryApplicationMachinesAndEquipment.setUuid(uuid);

		quarryApplicationMachinesAndEquipment.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return quarryApplicationMachinesAndEquipment;
	}

	/**
	 * Removes the quarry application machines and equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryApplicationMachinId the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment that was removed
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment remove(
			long quarryApplicationMachinId)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		return remove((Serializable)quarryApplicationMachinId);
	}

	/**
	 * Removes the quarry application machines and equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment that was removed
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment remove(Serializable primaryKey)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		Session session = null;

		try {
			session = openSession();

			QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment =
					(QuarryApplicationMachinesAndEquipment)session.get(
						QuarryApplicationMachinesAndEquipmentImpl.class,
						primaryKey);

			if (quarryApplicationMachinesAndEquipment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryApplicationMachinesAndEquipmentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryApplicationMachinesAndEquipment);
		}
		catch (NoSuchQuarryApplicationMachinesAndEquipmentException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected QuarryApplicationMachinesAndEquipment removeImpl(
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryApplicationMachinesAndEquipment)) {
				quarryApplicationMachinesAndEquipment =
					(QuarryApplicationMachinesAndEquipment)session.get(
						QuarryApplicationMachinesAndEquipmentImpl.class,
						quarryApplicationMachinesAndEquipment.
							getPrimaryKeyObj());
			}

			if (quarryApplicationMachinesAndEquipment != null) {
				session.delete(quarryApplicationMachinesAndEquipment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryApplicationMachinesAndEquipment != null) {
			clearCache(quarryApplicationMachinesAndEquipment);
		}

		return quarryApplicationMachinesAndEquipment;
	}

	@Override
	public QuarryApplicationMachinesAndEquipment updateImpl(
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment) {

		boolean isNew = quarryApplicationMachinesAndEquipment.isNew();

		if (!(quarryApplicationMachinesAndEquipment instanceof
				QuarryApplicationMachinesAndEquipmentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					quarryApplicationMachinesAndEquipment.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryApplicationMachinesAndEquipment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryApplicationMachinesAndEquipment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryApplicationMachinesAndEquipment implementation " +
					quarryApplicationMachinesAndEquipment.getClass());
		}

		QuarryApplicationMachinesAndEquipmentModelImpl
			quarryApplicationMachinesAndEquipmentModelImpl =
				(QuarryApplicationMachinesAndEquipmentModelImpl)
					quarryApplicationMachinesAndEquipment;

		if (Validator.isNull(quarryApplicationMachinesAndEquipment.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			quarryApplicationMachinesAndEquipment.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(quarryApplicationMachinesAndEquipment.getCreateDate() == null)) {

			if (serviceContext == null) {
				quarryApplicationMachinesAndEquipment.setCreateDate(date);
			}
			else {
				quarryApplicationMachinesAndEquipment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryApplicationMachinesAndEquipmentModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				quarryApplicationMachinesAndEquipment.setModifiedDate(date);
			}
			else {
				quarryApplicationMachinesAndEquipment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryApplicationMachinesAndEquipment);
			}
			else {
				quarryApplicationMachinesAndEquipment =
					(QuarryApplicationMachinesAndEquipment)session.merge(
						quarryApplicationMachinesAndEquipment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryApplicationMachinesAndEquipmentImpl.class,
			quarryApplicationMachinesAndEquipmentModelImpl, false, true);

		cacheUniqueFindersCache(quarryApplicationMachinesAndEquipmentModelImpl);

		if (isNew) {
			quarryApplicationMachinesAndEquipment.setNew(false);
		}

		quarryApplicationMachinesAndEquipment.resetOriginalValues();

		return quarryApplicationMachinesAndEquipment;
	}

	/**
	 * Returns the quarry application machines and equipment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment = fetchByPrimaryKey(
				primaryKey);

		if (quarryApplicationMachinesAndEquipment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryApplicationMachinesAndEquipmentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryApplicationMachinesAndEquipment;
	}

	/**
	 * Returns the quarry application machines and equipment with the primary key or throws a <code>NoSuchQuarryApplicationMachinesAndEquipmentException</code> if it could not be found.
	 *
	 * @param quarryApplicationMachinId the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment findByPrimaryKey(
			long quarryApplicationMachinId)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException {

		return findByPrimaryKey((Serializable)quarryApplicationMachinId);
	}

	/**
	 * Returns the quarry application machines and equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryApplicationMachinId the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment, or <code>null</code> if a quarry application machines and equipment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationMachinesAndEquipment fetchByPrimaryKey(
		long quarryApplicationMachinId) {

		return fetchByPrimaryKey((Serializable)quarryApplicationMachinId);
	}

	/**
	 * Returns all the quarry application machines and equipments.
	 *
	 * @return the quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry application machines and equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @return the range of quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry application machines and equipments
	 */
	@Override
	public List<QuarryApplicationMachinesAndEquipment> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<QuarryApplicationMachinesAndEquipment> list = null;

		if (useFinderCache) {
			list =
				(List<QuarryApplicationMachinesAndEquipment>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT;

				sql = sql.concat(
					QuarryApplicationMachinesAndEquipmentModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<QuarryApplicationMachinesAndEquipment>)QueryUtil.list(
						query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the quarry application machines and equipments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryApplicationMachinesAndEquipment
				quarryApplicationMachinesAndEquipment : findAll()) {

			remove(quarryApplicationMachinesAndEquipment);
		}
	}

	/**
	 * Returns the number of quarry application machines and equipments.
	 *
	 * @return the number of quarry application machines and equipments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "quarryApplicationMachinId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryApplicationMachinesAndEquipmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry application machines and equipment persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathWithPaginationFindBygetQuarryById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetQuarryById",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"quarryApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetQuarryById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetQuarryById",
			new String[] {String.class.getName()},
			new String[] {"quarryApplicationId"}, true);

		_finderPathCountBygetQuarryById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetQuarryById",
			new String[] {String.class.getName()},
			new String[] {"quarryApplicationId"}, false);

		_finderPathWithPaginationFindBygetQuarryMAchineEquipment_By_MachineName_AppId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetQuarryMAchineEquipment_By_MachineName_AppId",
				new String[] {
					String.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"quarryApplicationId", "manchineName"}, true);

		_finderPathWithoutPaginationFindBygetQuarryMAchineEquipment_By_MachineName_AppId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetQuarryMAchineEquipment_By_MachineName_AppId",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"quarryApplicationId", "manchineName"}, true);

		_finderPathCountBygetQuarryMAchineEquipment_By_MachineName_AppId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetQuarryMAchineEquipment_By_MachineName_AppId",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"quarryApplicationId", "manchineName"}, false);

		QuarryApplicationMachinesAndEquipmentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryApplicationMachinesAndEquipmentUtil.setPersistence(null);

		entityCache.removeCache(
			QuarryApplicationMachinesAndEquipmentImpl.class.getName());
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String
		_SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT =
			"SELECT quarryApplicationMachinesAndEquipment FROM QuarryApplicationMachinesAndEquipment quarryApplicationMachinesAndEquipment";

	private static final String
		_SQL_SELECT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE =
			"SELECT quarryApplicationMachinesAndEquipment FROM QuarryApplicationMachinesAndEquipment quarryApplicationMachinesAndEquipment WHERE ";

	private static final String
		_SQL_COUNT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT =
			"SELECT COUNT(quarryApplicationMachinesAndEquipment) FROM QuarryApplicationMachinesAndEquipment quarryApplicationMachinesAndEquipment";

	private static final String
		_SQL_COUNT_QUARRYAPPLICATIONMACHINESANDEQUIPMENT_WHERE =
			"SELECT COUNT(quarryApplicationMachinesAndEquipment) FROM QuarryApplicationMachinesAndEquipment quarryApplicationMachinesAndEquipment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"quarryApplicationMachinesAndEquipment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryApplicationMachinesAndEquipment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryApplicationMachinesAndEquipment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryApplicationMachinesAndEquipmentPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}