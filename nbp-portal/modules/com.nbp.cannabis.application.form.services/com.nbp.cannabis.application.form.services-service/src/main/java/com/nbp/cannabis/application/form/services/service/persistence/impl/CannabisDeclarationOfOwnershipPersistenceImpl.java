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

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisDeclarationOfOwnershipException;
import com.nbp.cannabis.application.form.services.model.CannabisDeclarationOfOwnership;
import com.nbp.cannabis.application.form.services.model.CannabisDeclarationOfOwnershipTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisDeclarationOfOwnershipImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisDeclarationOfOwnershipModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisDeclarationOfOwnershipPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisDeclarationOfOwnershipUtil;
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
 * The persistence implementation for the cannabis declaration of ownership service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisDeclarationOfOwnershipPersistence.class)
public class CannabisDeclarationOfOwnershipPersistenceImpl
	extends BasePersistenceImpl<CannabisDeclarationOfOwnership>
	implements CannabisDeclarationOfOwnershipPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisDeclarationOfOwnershipUtil</code> to access the cannabis declaration of ownership persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisDeclarationOfOwnershipImpl.class.getName();

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
	 * Returns all the cannabis declaration of ownerships where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis declaration of ownerships where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @return the range of matching cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator,
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

		List<CannabisDeclarationOfOwnership> list = null;

		if (useFinderCache) {
			list = (List<CannabisDeclarationOfOwnership>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisDeclarationOfOwnership
						cannabisDeclarationOfOwnership : list) {

					if (!uuid.equals(
							cannabisDeclarationOfOwnership.getUuid())) {

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

			sb.append(_SQL_SELECT_CANNABISDECLARATIONOFOWNERSHIP_WHERE);

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
					CannabisDeclarationOfOwnershipModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisDeclarationOfOwnership>)QueryUtil.list(
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
	 * Returns the first cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership findByUuid_First(
			String uuid,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
			fetchByUuid_First(uuid, orderByComparator);

		if (cannabisDeclarationOfOwnership != null) {
			return cannabisDeclarationOfOwnership;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisDeclarationOfOwnershipException(sb.toString());
	}

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		List<CannabisDeclarationOfOwnership> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
			fetchByUuid_Last(uuid, orderByComparator);

		if (cannabisDeclarationOfOwnership != null) {
			return cannabisDeclarationOfOwnership;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisDeclarationOfOwnershipException(sb.toString());
	}

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CannabisDeclarationOfOwnership> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis declaration of ownerships before and after the current cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the current cannabis declaration of ownership
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership[] findByUuid_PrevAndNext(
			long cannabisDecOfOwnershipId, String uuid,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		uuid = Objects.toString(uuid, "");

		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
			findByPrimaryKey(cannabisDecOfOwnershipId);

		Session session = null;

		try {
			session = openSession();

			CannabisDeclarationOfOwnership[] array =
				new CannabisDeclarationOfOwnershipImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, cannabisDeclarationOfOwnership, uuid,
				orderByComparator, true);

			array[1] = cannabisDeclarationOfOwnership;

			array[2] = getByUuid_PrevAndNext(
				session, cannabisDeclarationOfOwnership, uuid,
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

	protected CannabisDeclarationOfOwnership getByUuid_PrevAndNext(
		Session session,
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership,
		String uuid,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISDECLARATIONOFOWNERSHIP_WHERE);

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
			sb.append(CannabisDeclarationOfOwnershipModelImpl.ORDER_BY_JPQL);
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
						cannabisDeclarationOfOwnership)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisDeclarationOfOwnership> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis declaration of ownerships where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisDeclarationOfOwnership);
		}
	}

	/**
	 * Returns the number of cannabis declaration of ownerships where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis declaration of ownerships
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISDECLARATIONOFOWNERSHIP_WHERE);

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
		"cannabisDeclarationOfOwnership.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(cannabisDeclarationOfOwnership.uuid IS NULL OR cannabisDeclarationOfOwnership.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the cannabis declaration of ownership where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisDeclarationOfOwnershipException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
			fetchByUUID_G(uuid, groupId);

		if (cannabisDeclarationOfOwnership == null) {
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

			throw new NoSuchCannabisDeclarationOfOwnershipException(
				sb.toString());
		}

		return cannabisDeclarationOfOwnership;
	}

	/**
	 * Returns the cannabis declaration of ownership where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the cannabis declaration of ownership where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership fetchByUUID_G(
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

		if (result instanceof CannabisDeclarationOfOwnership) {
			CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
				(CannabisDeclarationOfOwnership)result;

			if (!Objects.equals(
					uuid, cannabisDeclarationOfOwnership.getUuid()) ||
				(groupId != cannabisDeclarationOfOwnership.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISDECLARATIONOFOWNERSHIP_WHERE);

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

				List<CannabisDeclarationOfOwnership> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					CannabisDeclarationOfOwnership
						cannabisDeclarationOfOwnership = list.get(0);

					result = cannabisDeclarationOfOwnership;

					cacheResult(cannabisDeclarationOfOwnership);
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
			return (CannabisDeclarationOfOwnership)result;
		}
	}

	/**
	 * Removes the cannabis declaration of ownership where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis declaration of ownership that was removed
	 */
	@Override
	public CannabisDeclarationOfOwnership removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
			findByUUID_G(uuid, groupId);

		return remove(cannabisDeclarationOfOwnership);
	}

	/**
	 * Returns the number of cannabis declaration of ownerships where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis declaration of ownerships
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISDECLARATIONOFOWNERSHIP_WHERE);

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
		"cannabisDeclarationOfOwnership.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(cannabisDeclarationOfOwnership.uuid IS NULL OR cannabisDeclarationOfOwnership.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"cannabisDeclarationOfOwnership.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the cannabis declaration of ownerships where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis declaration of ownerships where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @return the range of matching cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator,
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

		List<CannabisDeclarationOfOwnership> list = null;

		if (useFinderCache) {
			list = (List<CannabisDeclarationOfOwnership>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisDeclarationOfOwnership
						cannabisDeclarationOfOwnership : list) {

					if (!uuid.equals(
							cannabisDeclarationOfOwnership.getUuid()) ||
						(companyId !=
							cannabisDeclarationOfOwnership.getCompanyId())) {

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

			sb.append(_SQL_SELECT_CANNABISDECLARATIONOFOWNERSHIP_WHERE);

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
					CannabisDeclarationOfOwnershipModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisDeclarationOfOwnership>)QueryUtil.list(
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
	 * Returns the first cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (cannabisDeclarationOfOwnership != null) {
			return cannabisDeclarationOfOwnership;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisDeclarationOfOwnershipException(sb.toString());
	}

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		List<CannabisDeclarationOfOwnership> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (cannabisDeclarationOfOwnership != null) {
			return cannabisDeclarationOfOwnership;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisDeclarationOfOwnershipException(sb.toString());
	}

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CannabisDeclarationOfOwnership> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis declaration of ownerships before and after the current cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the current cannabis declaration of ownership
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership[] findByUuid_C_PrevAndNext(
			long cannabisDecOfOwnershipId, String uuid, long companyId,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		uuid = Objects.toString(uuid, "");

		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
			findByPrimaryKey(cannabisDecOfOwnershipId);

		Session session = null;

		try {
			session = openSession();

			CannabisDeclarationOfOwnership[] array =
				new CannabisDeclarationOfOwnershipImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, cannabisDeclarationOfOwnership, uuid, companyId,
				orderByComparator, true);

			array[1] = cannabisDeclarationOfOwnership;

			array[2] = getByUuid_C_PrevAndNext(
				session, cannabisDeclarationOfOwnership, uuid, companyId,
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

	protected CannabisDeclarationOfOwnership getByUuid_C_PrevAndNext(
		Session session,
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership,
		String uuid, long companyId,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISDECLARATIONOFOWNERSHIP_WHERE);

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
			sb.append(CannabisDeclarationOfOwnershipModelImpl.ORDER_BY_JPQL);
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
						cannabisDeclarationOfOwnership)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisDeclarationOfOwnership> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis declaration of ownerships where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisDeclarationOfOwnership);
		}
	}

	/**
	 * Returns the number of cannabis declaration of ownerships where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis declaration of ownerships
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISDECLARATIONOFOWNERSHIP_WHERE);

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
		"cannabisDeclarationOfOwnership.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(cannabisDeclarationOfOwnership.uuid IS NULL OR cannabisDeclarationOfOwnership.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"cannabisDeclarationOfOwnership.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetCA_DO_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetCA_DO_CAI;
	private FinderPath _finderPathCountBygetCA_DO_CAI;

	/**
	 * Returns all the cannabis declaration of ownerships where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findBygetCA_DO_CAI(
		long cannabisApplicationId) {

		return findBygetCA_DO_CAI(
			cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis declaration of ownerships where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @return the range of matching cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findBygetCA_DO_CAI(
		long cannabisApplicationId, int start, int end) {

		return findBygetCA_DO_CAI(cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findBygetCA_DO_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return findBygetCA_DO_CAI(
			cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findBygetCA_DO_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCA_DO_CAI;
				finderArgs = new Object[] {cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCA_DO_CAI;
			finderArgs = new Object[] {
				cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<CannabisDeclarationOfOwnership> list = null;

		if (useFinderCache) {
			list = (List<CannabisDeclarationOfOwnership>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisDeclarationOfOwnership
						cannabisDeclarationOfOwnership : list) {

					if (cannabisApplicationId !=
							cannabisDeclarationOfOwnership.
								getCannabisApplicationId()) {

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

			sb.append(_SQL_SELECT_CANNABISDECLARATIONOFOWNERSHIP_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_DO_CAI_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisDeclarationOfOwnershipModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				list = (List<CannabisDeclarationOfOwnership>)QueryUtil.list(
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
	 * Returns the first cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership findBygetCA_DO_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
			fetchBygetCA_DO_CAI_First(cannabisApplicationId, orderByComparator);

		if (cannabisDeclarationOfOwnership != null) {
			return cannabisDeclarationOfOwnership;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisDeclarationOfOwnershipException(sb.toString());
	}

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership fetchBygetCA_DO_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		List<CannabisDeclarationOfOwnership> list = findBygetCA_DO_CAI(
			cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership findBygetCA_DO_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
			fetchBygetCA_DO_CAI_Last(cannabisApplicationId, orderByComparator);

		if (cannabisDeclarationOfOwnership != null) {
			return cannabisDeclarationOfOwnership;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisDeclarationOfOwnershipException(sb.toString());
	}

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership fetchBygetCA_DO_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		int count = countBygetCA_DO_CAI(cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<CannabisDeclarationOfOwnership> list = findBygetCA_DO_CAI(
			cannabisApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis declaration of ownerships before and after the current cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the current cannabis declaration of ownership
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership[] findBygetCA_DO_CAI_PrevAndNext(
			long cannabisDecOfOwnershipId, long cannabisApplicationId,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
			findByPrimaryKey(cannabisDecOfOwnershipId);

		Session session = null;

		try {
			session = openSession();

			CannabisDeclarationOfOwnership[] array =
				new CannabisDeclarationOfOwnershipImpl[3];

			array[0] = getBygetCA_DO_CAI_PrevAndNext(
				session, cannabisDeclarationOfOwnership, cannabisApplicationId,
				orderByComparator, true);

			array[1] = cannabisDeclarationOfOwnership;

			array[2] = getBygetCA_DO_CAI_PrevAndNext(
				session, cannabisDeclarationOfOwnership, cannabisApplicationId,
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

	protected CannabisDeclarationOfOwnership getBygetCA_DO_CAI_PrevAndNext(
		Session session,
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership,
		long cannabisApplicationId,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISDECLARATIONOFOWNERSHIP_WHERE);

		sb.append(_FINDER_COLUMN_GETCA_DO_CAI_CANNABISAPPLICATIONID_2);

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
			sb.append(CannabisDeclarationOfOwnershipModelImpl.ORDER_BY_JPQL);
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
						cannabisDeclarationOfOwnership)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisDeclarationOfOwnership> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis declaration of ownerships where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetCA_DO_CAI(long cannabisApplicationId) {
		for (CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership :
				findBygetCA_DO_CAI(
					cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisDeclarationOfOwnership);
		}
	}

	/**
	 * Returns the number of cannabis declaration of ownerships where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis declaration of ownerships
	 */
	@Override
	public int countBygetCA_DO_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCA_DO_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISDECLARATIONOFOWNERSHIP_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_DO_CAI_CANNABISAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETCA_DO_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisDeclarationOfOwnership.cannabisApplicationId = ?";

	public CannabisDeclarationOfOwnershipPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CannabisDeclarationOfOwnership.class);

		setModelImplClass(CannabisDeclarationOfOwnershipImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisDeclarationOfOwnershipTable.INSTANCE);
	}

	/**
	 * Caches the cannabis declaration of ownership in the entity cache if it is enabled.
	 *
	 * @param cannabisDeclarationOfOwnership the cannabis declaration of ownership
	 */
	@Override
	public void cacheResult(
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership) {

		entityCache.putResult(
			CannabisDeclarationOfOwnershipImpl.class,
			cannabisDeclarationOfOwnership.getPrimaryKey(),
			cannabisDeclarationOfOwnership);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				cannabisDeclarationOfOwnership.getUuid(),
				cannabisDeclarationOfOwnership.getGroupId()
			},
			cannabisDeclarationOfOwnership);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis declaration of ownerships in the entity cache if it is enabled.
	 *
	 * @param cannabisDeclarationOfOwnerships the cannabis declaration of ownerships
	 */
	@Override
	public void cacheResult(
		List<CannabisDeclarationOfOwnership> cannabisDeclarationOfOwnerships) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisDeclarationOfOwnerships.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership :
				cannabisDeclarationOfOwnerships) {

			if (entityCache.getResult(
					CannabisDeclarationOfOwnershipImpl.class,
					cannabisDeclarationOfOwnership.getPrimaryKey()) == null) {

				cacheResult(cannabisDeclarationOfOwnership);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis declaration of ownerships.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisDeclarationOfOwnershipImpl.class);

		finderCache.clearCache(CannabisDeclarationOfOwnershipImpl.class);
	}

	/**
	 * Clears the cache for the cannabis declaration of ownership.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership) {

		entityCache.removeResult(
			CannabisDeclarationOfOwnershipImpl.class,
			cannabisDeclarationOfOwnership);
	}

	@Override
	public void clearCache(
		List<CannabisDeclarationOfOwnership> cannabisDeclarationOfOwnerships) {

		for (CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership :
				cannabisDeclarationOfOwnerships) {

			entityCache.removeResult(
				CannabisDeclarationOfOwnershipImpl.class,
				cannabisDeclarationOfOwnership);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisDeclarationOfOwnershipImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisDeclarationOfOwnershipImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisDeclarationOfOwnershipModelImpl
			cannabisDeclarationOfOwnershipModelImpl) {

		Object[] args = new Object[] {
			cannabisDeclarationOfOwnershipModelImpl.getUuid(),
			cannabisDeclarationOfOwnershipModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			cannabisDeclarationOfOwnershipModelImpl);
	}

	/**
	 * Creates a new cannabis declaration of ownership with the primary key. Does not add the cannabis declaration of ownership to the database.
	 *
	 * @param cannabisDecOfOwnershipId the primary key for the new cannabis declaration of ownership
	 * @return the new cannabis declaration of ownership
	 */
	@Override
	public CannabisDeclarationOfOwnership create(
		long cannabisDecOfOwnershipId) {

		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
			new CannabisDeclarationOfOwnershipImpl();

		cannabisDeclarationOfOwnership.setNew(true);
		cannabisDeclarationOfOwnership.setPrimaryKey(cannabisDecOfOwnershipId);

		String uuid = PortalUUIDUtil.generate();

		cannabisDeclarationOfOwnership.setUuid(uuid);

		cannabisDeclarationOfOwnership.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisDeclarationOfOwnership;
	}

	/**
	 * Removes the cannabis declaration of ownership with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership that was removed
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership remove(long cannabisDecOfOwnershipId)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		return remove((Serializable)cannabisDecOfOwnershipId);
	}

	/**
	 * Removes the cannabis declaration of ownership with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership that was removed
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership remove(Serializable primaryKey)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		Session session = null;

		try {
			session = openSession();

			CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
				(CannabisDeclarationOfOwnership)session.get(
					CannabisDeclarationOfOwnershipImpl.class, primaryKey);

			if (cannabisDeclarationOfOwnership == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisDeclarationOfOwnershipException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisDeclarationOfOwnership);
		}
		catch (NoSuchCannabisDeclarationOfOwnershipException
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
	protected CannabisDeclarationOfOwnership removeImpl(
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisDeclarationOfOwnership)) {
				cannabisDeclarationOfOwnership =
					(CannabisDeclarationOfOwnership)session.get(
						CannabisDeclarationOfOwnershipImpl.class,
						cannabisDeclarationOfOwnership.getPrimaryKeyObj());
			}

			if (cannabisDeclarationOfOwnership != null) {
				session.delete(cannabisDeclarationOfOwnership);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisDeclarationOfOwnership != null) {
			clearCache(cannabisDeclarationOfOwnership);
		}

		return cannabisDeclarationOfOwnership;
	}

	@Override
	public CannabisDeclarationOfOwnership updateImpl(
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership) {

		boolean isNew = cannabisDeclarationOfOwnership.isNew();

		if (!(cannabisDeclarationOfOwnership instanceof
				CannabisDeclarationOfOwnershipModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisDeclarationOfOwnership.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisDeclarationOfOwnership);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisDeclarationOfOwnership proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisDeclarationOfOwnership implementation " +
					cannabisDeclarationOfOwnership.getClass());
		}

		CannabisDeclarationOfOwnershipModelImpl
			cannabisDeclarationOfOwnershipModelImpl =
				(CannabisDeclarationOfOwnershipModelImpl)
					cannabisDeclarationOfOwnership;

		if (Validator.isNull(cannabisDeclarationOfOwnership.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			cannabisDeclarationOfOwnership.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisDeclarationOfOwnership.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisDeclarationOfOwnership.setCreateDate(date);
			}
			else {
				cannabisDeclarationOfOwnership.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisDeclarationOfOwnershipModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisDeclarationOfOwnership.setModifiedDate(date);
			}
			else {
				cannabisDeclarationOfOwnership.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisDeclarationOfOwnership);
			}
			else {
				cannabisDeclarationOfOwnership =
					(CannabisDeclarationOfOwnership)session.merge(
						cannabisDeclarationOfOwnership);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisDeclarationOfOwnershipImpl.class,
			cannabisDeclarationOfOwnershipModelImpl, false, true);

		cacheUniqueFindersCache(cannabisDeclarationOfOwnershipModelImpl);

		if (isNew) {
			cannabisDeclarationOfOwnership.setNew(false);
		}

		cannabisDeclarationOfOwnership.resetOriginalValues();

		return cannabisDeclarationOfOwnership;
	}

	/**
	 * Returns the cannabis declaration of ownership with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership =
			fetchByPrimaryKey(primaryKey);

		if (cannabisDeclarationOfOwnership == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisDeclarationOfOwnershipException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisDeclarationOfOwnership;
	}

	/**
	 * Returns the cannabis declaration of ownership with the primary key or throws a <code>NoSuchCannabisDeclarationOfOwnershipException</code> if it could not be found.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership findByPrimaryKey(
			long cannabisDecOfOwnershipId)
		throws NoSuchCannabisDeclarationOfOwnershipException {

		return findByPrimaryKey((Serializable)cannabisDecOfOwnershipId);
	}

	/**
	 * Returns the cannabis declaration of ownership with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership, or <code>null</code> if a cannabis declaration of ownership with the primary key could not be found
	 */
	@Override
	public CannabisDeclarationOfOwnership fetchByPrimaryKey(
		long cannabisDecOfOwnershipId) {

		return fetchByPrimaryKey((Serializable)cannabisDecOfOwnershipId);
	}

	/**
	 * Returns all the cannabis declaration of ownerships.
	 *
	 * @return the cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis declaration of ownerships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @return the range of cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findAll(
		int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis declaration of ownerships
	 */
	@Override
	public List<CannabisDeclarationOfOwnership> findAll(
		int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator,
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

		List<CannabisDeclarationOfOwnership> list = null;

		if (useFinderCache) {
			list = (List<CannabisDeclarationOfOwnership>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISDECLARATIONOFOWNERSHIP);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISDECLARATIONOFOWNERSHIP;

				sql = sql.concat(
					CannabisDeclarationOfOwnershipModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisDeclarationOfOwnership>)QueryUtil.list(
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
	 * Removes all the cannabis declaration of ownerships from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership :
				findAll()) {

			remove(cannabisDeclarationOfOwnership);
		}
	}

	/**
	 * Returns the number of cannabis declaration of ownerships.
	 *
	 * @return the number of cannabis declaration of ownerships
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
					_SQL_COUNT_CANNABISDECLARATIONOFOWNERSHIP);

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
		return "cannabisDecOfOwnershipId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISDECLARATIONOFOWNERSHIP;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisDeclarationOfOwnershipModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis declaration of ownership persistence.
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

		_finderPathWithPaginationFindBygetCA_DO_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCA_DO_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCA_DO_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCA_DO_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCA_DO_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCA_DO_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		CannabisDeclarationOfOwnershipUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisDeclarationOfOwnershipUtil.setPersistence(null);

		entityCache.removeCache(
			CannabisDeclarationOfOwnershipImpl.class.getName());
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

	private static final String _SQL_SELECT_CANNABISDECLARATIONOFOWNERSHIP =
		"SELECT cannabisDeclarationOfOwnership FROM CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership";

	private static final String
		_SQL_SELECT_CANNABISDECLARATIONOFOWNERSHIP_WHERE =
			"SELECT cannabisDeclarationOfOwnership FROM CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership WHERE ";

	private static final String _SQL_COUNT_CANNABISDECLARATIONOFOWNERSHIP =
		"SELECT COUNT(cannabisDeclarationOfOwnership) FROM CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership";

	private static final String
		_SQL_COUNT_CANNABISDECLARATIONOFOWNERSHIP_WHERE =
			"SELECT COUNT(cannabisDeclarationOfOwnership) FROM CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisDeclarationOfOwnership.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisDeclarationOfOwnership exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisDeclarationOfOwnership exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisDeclarationOfOwnershipPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}