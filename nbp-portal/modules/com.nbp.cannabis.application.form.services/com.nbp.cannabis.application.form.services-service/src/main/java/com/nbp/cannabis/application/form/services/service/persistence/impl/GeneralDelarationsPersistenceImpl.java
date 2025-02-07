/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence.impl;

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

import com.nbp.cannabis.application.form.services.exception.NoSuchGeneralDelarationsException;
import com.nbp.cannabis.application.form.services.model.GeneralDelarations;
import com.nbp.cannabis.application.form.services.model.GeneralDelarationsTable;
import com.nbp.cannabis.application.form.services.model.impl.GeneralDelarationsImpl;
import com.nbp.cannabis.application.form.services.model.impl.GeneralDelarationsModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.GeneralDelarationsPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.GeneralDelarationsUtil;
import com.nbp.cannabis.application.form.services.service.persistence.impl.constants.CANNABISPersistenceConstants;

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
 * The persistence implementation for the general delarations service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = GeneralDelarationsPersistence.class)
public class GeneralDelarationsPersistenceImpl
	extends BasePersistenceImpl<GeneralDelarations>
	implements GeneralDelarationsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>GeneralDelarationsUtil</code> to access the general delarations persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		GeneralDelarationsImpl.class.getName();

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
	 * Returns all the general delarationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching general delarationses
	 */
	@Override
	public List<GeneralDelarations> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the general delarationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @return the range of matching general delarationses
	 */
	@Override
	public List<GeneralDelarations> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the general delarationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching general delarationses
	 */
	@Override
	public List<GeneralDelarations> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the general delarationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching general delarationses
	 */
	@Override
	public List<GeneralDelarations> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator,
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

		List<GeneralDelarations> list = null;

		if (useFinderCache) {
			list = (List<GeneralDelarations>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (GeneralDelarations generalDelarations : list) {
					if (!uuid.equals(generalDelarations.getUuid())) {
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

			sb.append(_SQL_SELECT_GENERALDELARATIONS_WHERE);

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
				sb.append(GeneralDelarationsModelImpl.ORDER_BY_JPQL);
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

				list = (List<GeneralDelarations>)QueryUtil.list(
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
	 * Returns the first general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations findByUuid_First(
			String uuid,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws NoSuchGeneralDelarationsException {

		GeneralDelarations generalDelarations = fetchByUuid_First(
			uuid, orderByComparator);

		if (generalDelarations != null) {
			return generalDelarations;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchGeneralDelarationsException(sb.toString());
	}

	/**
	 * Returns the first general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations fetchByUuid_First(
		String uuid, OrderByComparator<GeneralDelarations> orderByComparator) {

		List<GeneralDelarations> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations findByUuid_Last(
			String uuid,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws NoSuchGeneralDelarationsException {

		GeneralDelarations generalDelarations = fetchByUuid_Last(
			uuid, orderByComparator);

		if (generalDelarations != null) {
			return generalDelarations;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchGeneralDelarationsException(sb.toString());
	}

	/**
	 * Returns the last general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations fetchByUuid_Last(
		String uuid, OrderByComparator<GeneralDelarations> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<GeneralDelarations> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the general delarationses before and after the current general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param generalDeclarationId the primary key of the current general delarations
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next general delarations
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	@Override
	public GeneralDelarations[] findByUuid_PrevAndNext(
			long generalDeclarationId, String uuid,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws NoSuchGeneralDelarationsException {

		uuid = Objects.toString(uuid, "");

		GeneralDelarations generalDelarations = findByPrimaryKey(
			generalDeclarationId);

		Session session = null;

		try {
			session = openSession();

			GeneralDelarations[] array = new GeneralDelarationsImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, generalDelarations, uuid, orderByComparator, true);

			array[1] = generalDelarations;

			array[2] = getByUuid_PrevAndNext(
				session, generalDelarations, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected GeneralDelarations getByUuid_PrevAndNext(
		Session session, GeneralDelarations generalDelarations, String uuid,
		OrderByComparator<GeneralDelarations> orderByComparator,
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

		sb.append(_SQL_SELECT_GENERALDELARATIONS_WHERE);

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
			sb.append(GeneralDelarationsModelImpl.ORDER_BY_JPQL);
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
						generalDelarations)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<GeneralDelarations> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the general delarationses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (GeneralDelarations generalDelarations :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(generalDelarations);
		}
	}

	/**
	 * Returns the number of general delarationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching general delarationses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_GENERALDELARATIONS_WHERE);

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
		"generalDelarations.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(generalDelarations.uuid IS NULL OR generalDelarations.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the general delarations where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGeneralDelarationsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations findByUUID_G(String uuid, long groupId)
		throws NoSuchGeneralDelarationsException {

		GeneralDelarations generalDelarations = fetchByUUID_G(uuid, groupId);

		if (generalDelarations == null) {
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

			throw new NoSuchGeneralDelarationsException(sb.toString());
		}

		return generalDelarations;
	}

	/**
	 * Returns the general delarations where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the general delarations where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations fetchByUUID_G(
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

		if (result instanceof GeneralDelarations) {
			GeneralDelarations generalDelarations = (GeneralDelarations)result;

			if (!Objects.equals(uuid, generalDelarations.getUuid()) ||
				(groupId != generalDelarations.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_GENERALDELARATIONS_WHERE);

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

				List<GeneralDelarations> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					GeneralDelarations generalDelarations = list.get(0);

					result = generalDelarations;

					cacheResult(generalDelarations);
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
			return (GeneralDelarations)result;
		}
	}

	/**
	 * Removes the general delarations where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the general delarations that was removed
	 */
	@Override
	public GeneralDelarations removeByUUID_G(String uuid, long groupId)
		throws NoSuchGeneralDelarationsException {

		GeneralDelarations generalDelarations = findByUUID_G(uuid, groupId);

		return remove(generalDelarations);
	}

	/**
	 * Returns the number of general delarationses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching general delarationses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_GENERALDELARATIONS_WHERE);

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
		"generalDelarations.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(generalDelarations.uuid IS NULL OR generalDelarations.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"generalDelarations.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the general delarationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching general delarationses
	 */
	@Override
	public List<GeneralDelarations> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the general delarationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @return the range of matching general delarationses
	 */
	@Override
	public List<GeneralDelarations> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the general delarationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching general delarationses
	 */
	@Override
	public List<GeneralDelarations> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the general delarationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching general delarationses
	 */
	@Override
	public List<GeneralDelarations> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator,
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

		List<GeneralDelarations> list = null;

		if (useFinderCache) {
			list = (List<GeneralDelarations>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (GeneralDelarations generalDelarations : list) {
					if (!uuid.equals(generalDelarations.getUuid()) ||
						(companyId != generalDelarations.getCompanyId())) {

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

			sb.append(_SQL_SELECT_GENERALDELARATIONS_WHERE);

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
				sb.append(GeneralDelarationsModelImpl.ORDER_BY_JPQL);
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

				list = (List<GeneralDelarations>)QueryUtil.list(
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
	 * Returns the first general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws NoSuchGeneralDelarationsException {

		GeneralDelarations generalDelarations = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (generalDelarations != null) {
			return generalDelarations;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchGeneralDelarationsException(sb.toString());
	}

	/**
	 * Returns the first general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		List<GeneralDelarations> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws NoSuchGeneralDelarationsException {

		GeneralDelarations generalDelarations = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (generalDelarations != null) {
			return generalDelarations;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchGeneralDelarationsException(sb.toString());
	}

	/**
	 * Returns the last general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<GeneralDelarations> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the general delarationses before and after the current general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param generalDeclarationId the primary key of the current general delarations
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next general delarations
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	@Override
	public GeneralDelarations[] findByUuid_C_PrevAndNext(
			long generalDeclarationId, String uuid, long companyId,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws NoSuchGeneralDelarationsException {

		uuid = Objects.toString(uuid, "");

		GeneralDelarations generalDelarations = findByPrimaryKey(
			generalDeclarationId);

		Session session = null;

		try {
			session = openSession();

			GeneralDelarations[] array = new GeneralDelarationsImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, generalDelarations, uuid, companyId, orderByComparator,
				true);

			array[1] = generalDelarations;

			array[2] = getByUuid_C_PrevAndNext(
				session, generalDelarations, uuid, companyId, orderByComparator,
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

	protected GeneralDelarations getByUuid_C_PrevAndNext(
		Session session, GeneralDelarations generalDelarations, String uuid,
		long companyId, OrderByComparator<GeneralDelarations> orderByComparator,
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

		sb.append(_SQL_SELECT_GENERALDELARATIONS_WHERE);

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
			sb.append(GeneralDelarationsModelImpl.ORDER_BY_JPQL);
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
						generalDelarations)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<GeneralDelarations> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the general delarationses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (GeneralDelarations generalDelarations :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(generalDelarations);
		}
	}

	/**
	 * Returns the number of general delarationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching general delarationses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_GENERALDELARATIONS_WHERE);

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
		"generalDelarations.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(generalDelarations.uuid IS NULL OR generalDelarations.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"generalDelarations.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetCA_GD_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetCA_GD_CAI;
	private FinderPath _finderPathCountBygetCA_GD_CAI;

	/**
	 * Returns all the general delarationses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching general delarationses
	 */
	@Override
	public List<GeneralDelarations> findBygetCA_GD_CAI(
		long cannabisApplicationId) {

		return findBygetCA_GD_CAI(
			cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the general delarationses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @return the range of matching general delarationses
	 */
	@Override
	public List<GeneralDelarations> findBygetCA_GD_CAI(
		long cannabisApplicationId, int start, int end) {

		return findBygetCA_GD_CAI(cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the general delarationses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching general delarationses
	 */
	@Override
	public List<GeneralDelarations> findBygetCA_GD_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		return findBygetCA_GD_CAI(
			cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the general delarationses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching general delarationses
	 */
	@Override
	public List<GeneralDelarations> findBygetCA_GD_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCA_GD_CAI;
				finderArgs = new Object[] {cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCA_GD_CAI;
			finderArgs = new Object[] {
				cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<GeneralDelarations> list = null;

		if (useFinderCache) {
			list = (List<GeneralDelarations>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (GeneralDelarations generalDelarations : list) {
					if (cannabisApplicationId !=
							generalDelarations.getCannabisApplicationId()) {

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

			sb.append(_SQL_SELECT_GENERALDELARATIONS_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_GD_CAI_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(GeneralDelarationsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				list = (List<GeneralDelarations>)QueryUtil.list(
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
	 * Returns the first general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations findBygetCA_GD_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws NoSuchGeneralDelarationsException {

		GeneralDelarations generalDelarations = fetchBygetCA_GD_CAI_First(
			cannabisApplicationId, orderByComparator);

		if (generalDelarations != null) {
			return generalDelarations;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchGeneralDelarationsException(sb.toString());
	}

	/**
	 * Returns the first general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations fetchBygetCA_GD_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		List<GeneralDelarations> list = findBygetCA_GD_CAI(
			cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations findBygetCA_GD_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws NoSuchGeneralDelarationsException {

		GeneralDelarations generalDelarations = fetchBygetCA_GD_CAI_Last(
			cannabisApplicationId, orderByComparator);

		if (generalDelarations != null) {
			return generalDelarations;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchGeneralDelarationsException(sb.toString());
	}

	/**
	 * Returns the last general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	@Override
	public GeneralDelarations fetchBygetCA_GD_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		int count = countBygetCA_GD_CAI(cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<GeneralDelarations> list = findBygetCA_GD_CAI(
			cannabisApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the general delarationses before and after the current general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param generalDeclarationId the primary key of the current general delarations
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next general delarations
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	@Override
	public GeneralDelarations[] findBygetCA_GD_CAI_PrevAndNext(
			long generalDeclarationId, long cannabisApplicationId,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws NoSuchGeneralDelarationsException {

		GeneralDelarations generalDelarations = findByPrimaryKey(
			generalDeclarationId);

		Session session = null;

		try {
			session = openSession();

			GeneralDelarations[] array = new GeneralDelarationsImpl[3];

			array[0] = getBygetCA_GD_CAI_PrevAndNext(
				session, generalDelarations, cannabisApplicationId,
				orderByComparator, true);

			array[1] = generalDelarations;

			array[2] = getBygetCA_GD_CAI_PrevAndNext(
				session, generalDelarations, cannabisApplicationId,
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

	protected GeneralDelarations getBygetCA_GD_CAI_PrevAndNext(
		Session session, GeneralDelarations generalDelarations,
		long cannabisApplicationId,
		OrderByComparator<GeneralDelarations> orderByComparator,
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

		sb.append(_SQL_SELECT_GENERALDELARATIONS_WHERE);

		sb.append(_FINDER_COLUMN_GETCA_GD_CAI_CANNABISAPPLICATIONID_2);

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
			sb.append(GeneralDelarationsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(cannabisApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						generalDelarations)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<GeneralDelarations> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the general delarationses where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetCA_GD_CAI(long cannabisApplicationId) {
		for (GeneralDelarations generalDelarations :
				findBygetCA_GD_CAI(
					cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(generalDelarations);
		}
	}

	/**
	 * Returns the number of general delarationses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching general delarationses
	 */
	@Override
	public int countBygetCA_GD_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCA_GD_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_GENERALDELARATIONS_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_GD_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

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
		_FINDER_COLUMN_GETCA_GD_CAI_CANNABISAPPLICATIONID_2 =
			"generalDelarations.cannabisApplicationId = ?";

	public GeneralDelarationsPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(GeneralDelarations.class);

		setModelImplClass(GeneralDelarationsImpl.class);
		setModelPKClass(long.class);

		setTable(GeneralDelarationsTable.INSTANCE);
	}

	/**
	 * Caches the general delarations in the entity cache if it is enabled.
	 *
	 * @param generalDelarations the general delarations
	 */
	@Override
	public void cacheResult(GeneralDelarations generalDelarations) {
		entityCache.putResult(
			GeneralDelarationsImpl.class, generalDelarations.getPrimaryKey(),
			generalDelarations);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				generalDelarations.getUuid(), generalDelarations.getGroupId()
			},
			generalDelarations);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the general delarationses in the entity cache if it is enabled.
	 *
	 * @param generalDelarationses the general delarationses
	 */
	@Override
	public void cacheResult(List<GeneralDelarations> generalDelarationses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (generalDelarationses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (GeneralDelarations generalDelarations : generalDelarationses) {
			if (entityCache.getResult(
					GeneralDelarationsImpl.class,
					generalDelarations.getPrimaryKey()) == null) {

				cacheResult(generalDelarations);
			}
		}
	}

	/**
	 * Clears the cache for all general delarationses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(GeneralDelarationsImpl.class);

		finderCache.clearCache(GeneralDelarationsImpl.class);
	}

	/**
	 * Clears the cache for the general delarations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(GeneralDelarations generalDelarations) {
		entityCache.removeResult(
			GeneralDelarationsImpl.class, generalDelarations);
	}

	@Override
	public void clearCache(List<GeneralDelarations> generalDelarationses) {
		for (GeneralDelarations generalDelarations : generalDelarationses) {
			entityCache.removeResult(
				GeneralDelarationsImpl.class, generalDelarations);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(GeneralDelarationsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(GeneralDelarationsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		GeneralDelarationsModelImpl generalDelarationsModelImpl) {

		Object[] args = new Object[] {
			generalDelarationsModelImpl.getUuid(),
			generalDelarationsModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, generalDelarationsModelImpl);
	}

	/**
	 * Creates a new general delarations with the primary key. Does not add the general delarations to the database.
	 *
	 * @param generalDeclarationId the primary key for the new general delarations
	 * @return the new general delarations
	 */
	@Override
	public GeneralDelarations create(long generalDeclarationId) {
		GeneralDelarations generalDelarations = new GeneralDelarationsImpl();

		generalDelarations.setNew(true);
		generalDelarations.setPrimaryKey(generalDeclarationId);

		String uuid = PortalUUIDUtil.generate();

		generalDelarations.setUuid(uuid);

		generalDelarations.setCompanyId(CompanyThreadLocal.getCompanyId());

		return generalDelarations;
	}

	/**
	 * Removes the general delarations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param generalDeclarationId the primary key of the general delarations
	 * @return the general delarations that was removed
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	@Override
	public GeneralDelarations remove(long generalDeclarationId)
		throws NoSuchGeneralDelarationsException {

		return remove((Serializable)generalDeclarationId);
	}

	/**
	 * Removes the general delarations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the general delarations
	 * @return the general delarations that was removed
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	@Override
	public GeneralDelarations remove(Serializable primaryKey)
		throws NoSuchGeneralDelarationsException {

		Session session = null;

		try {
			session = openSession();

			GeneralDelarations generalDelarations =
				(GeneralDelarations)session.get(
					GeneralDelarationsImpl.class, primaryKey);

			if (generalDelarations == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchGeneralDelarationsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(generalDelarations);
		}
		catch (NoSuchGeneralDelarationsException noSuchEntityException) {
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
	protected GeneralDelarations removeImpl(
		GeneralDelarations generalDelarations) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(generalDelarations)) {
				generalDelarations = (GeneralDelarations)session.get(
					GeneralDelarationsImpl.class,
					generalDelarations.getPrimaryKeyObj());
			}

			if (generalDelarations != null) {
				session.delete(generalDelarations);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (generalDelarations != null) {
			clearCache(generalDelarations);
		}

		return generalDelarations;
	}

	@Override
	public GeneralDelarations updateImpl(
		GeneralDelarations generalDelarations) {

		boolean isNew = generalDelarations.isNew();

		if (!(generalDelarations instanceof GeneralDelarationsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(generalDelarations.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					generalDelarations);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in generalDelarations proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom GeneralDelarations implementation " +
					generalDelarations.getClass());
		}

		GeneralDelarationsModelImpl generalDelarationsModelImpl =
			(GeneralDelarationsModelImpl)generalDelarations;

		if (Validator.isNull(generalDelarations.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			generalDelarations.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (generalDelarations.getCreateDate() == null)) {
			if (serviceContext == null) {
				generalDelarations.setCreateDate(date);
			}
			else {
				generalDelarations.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!generalDelarationsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				generalDelarations.setModifiedDate(date);
			}
			else {
				generalDelarations.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(generalDelarations);
			}
			else {
				generalDelarations = (GeneralDelarations)session.merge(
					generalDelarations);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			GeneralDelarationsImpl.class, generalDelarationsModelImpl, false,
			true);

		cacheUniqueFindersCache(generalDelarationsModelImpl);

		if (isNew) {
			generalDelarations.setNew(false);
		}

		generalDelarations.resetOriginalValues();

		return generalDelarations;
	}

	/**
	 * Returns the general delarations with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the general delarations
	 * @return the general delarations
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	@Override
	public GeneralDelarations findByPrimaryKey(Serializable primaryKey)
		throws NoSuchGeneralDelarationsException {

		GeneralDelarations generalDelarations = fetchByPrimaryKey(primaryKey);

		if (generalDelarations == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchGeneralDelarationsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return generalDelarations;
	}

	/**
	 * Returns the general delarations with the primary key or throws a <code>NoSuchGeneralDelarationsException</code> if it could not be found.
	 *
	 * @param generalDeclarationId the primary key of the general delarations
	 * @return the general delarations
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	@Override
	public GeneralDelarations findByPrimaryKey(long generalDeclarationId)
		throws NoSuchGeneralDelarationsException {

		return findByPrimaryKey((Serializable)generalDeclarationId);
	}

	/**
	 * Returns the general delarations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param generalDeclarationId the primary key of the general delarations
	 * @return the general delarations, or <code>null</code> if a general delarations with the primary key could not be found
	 */
	@Override
	public GeneralDelarations fetchByPrimaryKey(long generalDeclarationId) {
		return fetchByPrimaryKey((Serializable)generalDeclarationId);
	}

	/**
	 * Returns all the general delarationses.
	 *
	 * @return the general delarationses
	 */
	@Override
	public List<GeneralDelarations> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the general delarationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @return the range of general delarationses
	 */
	@Override
	public List<GeneralDelarations> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the general delarationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of general delarationses
	 */
	@Override
	public List<GeneralDelarations> findAll(
		int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the general delarationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of general delarationses
	 */
	@Override
	public List<GeneralDelarations> findAll(
		int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator,
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

		List<GeneralDelarations> list = null;

		if (useFinderCache) {
			list = (List<GeneralDelarations>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_GENERALDELARATIONS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_GENERALDELARATIONS;

				sql = sql.concat(GeneralDelarationsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<GeneralDelarations>)QueryUtil.list(
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
	 * Removes all the general delarationses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (GeneralDelarations generalDelarations : findAll()) {
			remove(generalDelarations);
		}
	}

	/**
	 * Returns the number of general delarationses.
	 *
	 * @return the number of general delarationses
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
					_SQL_COUNT_GENERALDELARATIONS);

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
		return "generalDeclarationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_GENERALDELARATIONS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return GeneralDelarationsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the general delarations persistence.
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

		_finderPathWithPaginationFindBygetCA_GD_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCA_GD_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCA_GD_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCA_GD_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCA_GD_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCA_GD_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		GeneralDelarationsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		GeneralDelarationsUtil.setPersistence(null);

		entityCache.removeCache(GeneralDelarationsImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_GENERALDELARATIONS =
		"SELECT generalDelarations FROM GeneralDelarations generalDelarations";

	private static final String _SQL_SELECT_GENERALDELARATIONS_WHERE =
		"SELECT generalDelarations FROM GeneralDelarations generalDelarations WHERE ";

	private static final String _SQL_COUNT_GENERALDELARATIONS =
		"SELECT COUNT(generalDelarations) FROM GeneralDelarations generalDelarations";

	private static final String _SQL_COUNT_GENERALDELARATIONS_WHERE =
		"SELECT COUNT(generalDelarations) FROM GeneralDelarations generalDelarations WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "generalDelarations.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No GeneralDelarations exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No GeneralDelarations exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		GeneralDelarationsPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}