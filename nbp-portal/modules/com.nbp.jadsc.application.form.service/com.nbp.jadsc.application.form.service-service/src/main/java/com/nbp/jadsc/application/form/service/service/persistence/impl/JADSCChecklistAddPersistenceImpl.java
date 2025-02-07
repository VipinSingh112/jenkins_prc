/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence.impl;

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

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCChecklistAddException;
import com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd;
import com.nbp.jadsc.application.form.service.model.JADSCChecklistAddTable;
import com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistAddImpl;
import com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistAddModelImpl;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCChecklistAddPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCChecklistAddUtil;
import com.nbp.jadsc.application.form.service.service.persistence.impl.constants.JADSC_FORMPersistenceConstants;

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
 * The persistence implementation for the jadsc checklist add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JADSCChecklistAddPersistence.class)
public class JADSCChecklistAddPersistenceImpl
	extends BasePersistenceImpl<JADSCChecklistAdd>
	implements JADSCChecklistAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JADSCChecklistAddUtil</code> to access the jadsc checklist add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JADSCChecklistAddImpl.class.getName();

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
	 * Returns all the jadsc checklist adds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc checklist adds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator,
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

		List<JADSCChecklistAdd> list = null;

		if (useFinderCache) {
			list = (List<JADSCChecklistAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCChecklistAdd jadscChecklistAdd : list) {
					if (!uuid.equals(jadscChecklistAdd.getUuid())) {
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

			sb.append(_SQL_SELECT_JADSCCHECKLISTADD_WHERE);

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
				sb.append(JADSCChecklistAddModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCChecklistAdd>)QueryUtil.list(
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
	 * Returns the first jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd findByUuid_First(
			String uuid, OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws NoSuchJADSCChecklistAddException {

		JADSCChecklistAdd jadscChecklistAdd = fetchByUuid_First(
			uuid, orderByComparator);

		if (jadscChecklistAdd != null) {
			return jadscChecklistAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCChecklistAddException(sb.toString());
	}

	/**
	 * Returns the first jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd fetchByUuid_First(
		String uuid, OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		List<JADSCChecklistAdd> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd findByUuid_Last(
			String uuid, OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws NoSuchJADSCChecklistAddException {

		JADSCChecklistAdd jadscChecklistAdd = fetchByUuid_Last(
			uuid, orderByComparator);

		if (jadscChecklistAdd != null) {
			return jadscChecklistAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCChecklistAddException(sb.toString());
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd fetchByUuid_Last(
		String uuid, OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JADSCChecklistAdd> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc checklist adds before and after the current jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param jADSCChecklistAddId the primary key of the current jadsc checklist add
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	@Override
	public JADSCChecklistAdd[] findByUuid_PrevAndNext(
			long jADSCChecklistAddId, String uuid,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws NoSuchJADSCChecklistAddException {

		uuid = Objects.toString(uuid, "");

		JADSCChecklistAdd jadscChecklistAdd = findByPrimaryKey(
			jADSCChecklistAddId);

		Session session = null;

		try {
			session = openSession();

			JADSCChecklistAdd[] array = new JADSCChecklistAddImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, jadscChecklistAdd, uuid, orderByComparator, true);

			array[1] = jadscChecklistAdd;

			array[2] = getByUuid_PrevAndNext(
				session, jadscChecklistAdd, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JADSCChecklistAdd getByUuid_PrevAndNext(
		Session session, JADSCChecklistAdd jadscChecklistAdd, String uuid,
		OrderByComparator<JADSCChecklistAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCCHECKLISTADD_WHERE);

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
			sb.append(JADSCChecklistAddModelImpl.ORDER_BY_JPQL);
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
						jadscChecklistAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCChecklistAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc checklist adds where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JADSCChecklistAdd jadscChecklistAdd :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscChecklistAdd);
		}
	}

	/**
	 * Returns the number of jadsc checklist adds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc checklist adds
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCCHECKLISTADD_WHERE);

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
		"jadscChecklistAdd.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(jadscChecklistAdd.uuid IS NULL OR jadscChecklistAdd.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the jadsc checklist add where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCChecklistAddException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCChecklistAddException {

		JADSCChecklistAdd jadscChecklistAdd = fetchByUUID_G(uuid, groupId);

		if (jadscChecklistAdd == null) {
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

			throw new NoSuchJADSCChecklistAddException(sb.toString());
		}

		return jadscChecklistAdd;
	}

	/**
	 * Returns the jadsc checklist add where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the jadsc checklist add where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd fetchByUUID_G(
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

		if (result instanceof JADSCChecklistAdd) {
			JADSCChecklistAdd jadscChecklistAdd = (JADSCChecklistAdd)result;

			if (!Objects.equals(uuid, jadscChecklistAdd.getUuid()) ||
				(groupId != jadscChecklistAdd.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCCHECKLISTADD_WHERE);

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

				List<JADSCChecklistAdd> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JADSCChecklistAdd jadscChecklistAdd = list.get(0);

					result = jadscChecklistAdd;

					cacheResult(jadscChecklistAdd);
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
			return (JADSCChecklistAdd)result;
		}
	}

	/**
	 * Removes the jadsc checklist add where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc checklist add that was removed
	 */
	@Override
	public JADSCChecklistAdd removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCChecklistAddException {

		JADSCChecklistAdd jadscChecklistAdd = findByUUID_G(uuid, groupId);

		return remove(jadscChecklistAdd);
	}

	/**
	 * Returns the number of jadsc checklist adds where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc checklist adds
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCCHECKLISTADD_WHERE);

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
		"jadscChecklistAdd.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(jadscChecklistAdd.uuid IS NULL OR jadscChecklistAdd.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"jadscChecklistAdd.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator,
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

		List<JADSCChecklistAdd> list = null;

		if (useFinderCache) {
			list = (List<JADSCChecklistAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCChecklistAdd jadscChecklistAdd : list) {
					if (!uuid.equals(jadscChecklistAdd.getUuid()) ||
						(companyId != jadscChecklistAdd.getCompanyId())) {

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

			sb.append(_SQL_SELECT_JADSCCHECKLISTADD_WHERE);

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
				sb.append(JADSCChecklistAddModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCChecklistAdd>)QueryUtil.list(
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
	 * Returns the first jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws NoSuchJADSCChecklistAddException {

		JADSCChecklistAdd jadscChecklistAdd = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (jadscChecklistAdd != null) {
			return jadscChecklistAdd;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCChecklistAddException(sb.toString());
	}

	/**
	 * Returns the first jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		List<JADSCChecklistAdd> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws NoSuchJADSCChecklistAddException {

		JADSCChecklistAdd jadscChecklistAdd = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (jadscChecklistAdd != null) {
			return jadscChecklistAdd;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCChecklistAddException(sb.toString());
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JADSCChecklistAdd> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc checklist adds before and after the current jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jADSCChecklistAddId the primary key of the current jadsc checklist add
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	@Override
	public JADSCChecklistAdd[] findByUuid_C_PrevAndNext(
			long jADSCChecklistAddId, String uuid, long companyId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws NoSuchJADSCChecklistAddException {

		uuid = Objects.toString(uuid, "");

		JADSCChecklistAdd jadscChecklistAdd = findByPrimaryKey(
			jADSCChecklistAddId);

		Session session = null;

		try {
			session = openSession();

			JADSCChecklistAdd[] array = new JADSCChecklistAddImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, jadscChecklistAdd, uuid, companyId, orderByComparator,
				true);

			array[1] = jadscChecklistAdd;

			array[2] = getByUuid_C_PrevAndNext(
				session, jadscChecklistAdd, uuid, companyId, orderByComparator,
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

	protected JADSCChecklistAdd getByUuid_C_PrevAndNext(
		Session session, JADSCChecklistAdd jadscChecklistAdd, String uuid,
		long companyId, OrderByComparator<JADSCChecklistAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCCHECKLISTADD_WHERE);

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
			sb.append(JADSCChecklistAddModelImpl.ORDER_BY_JPQL);
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
						jadscChecklistAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCChecklistAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc checklist adds where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JADSCChecklistAdd jadscChecklistAdd :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscChecklistAdd);
		}
	}

	/**
	 * Returns the number of jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc checklist adds
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCCHECKLISTADD_WHERE);

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
		"jadscChecklistAdd.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(jadscChecklistAdd.uuid IS NULL OR jadscChecklistAdd.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"jadscChecklistAdd.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetJADSCById;
	private FinderPath _finderPathWithoutPaginationFindBygetJADSCById;
	private FinderPath _finderPathCountBygetJADSCById;

	/**
	 * Returns all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findBygetJADSCById(long jadscApplicationId) {
		return findBygetJADSCById(
			jadscApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findBygetJADSCById(
		long jadscApplicationId, int start, int end) {

		return findBygetJADSCById(jadscApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findBygetJADSCById(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return findBygetJADSCById(
			jadscApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findBygetJADSCById(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJADSCById;
				finderArgs = new Object[] {jadscApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJADSCById;
			finderArgs = new Object[] {
				jadscApplicationId, start, end, orderByComparator
			};
		}

		List<JADSCChecklistAdd> list = null;

		if (useFinderCache) {
			list = (List<JADSCChecklistAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCChecklistAdd jadscChecklistAdd : list) {
					if (jadscApplicationId !=
							jadscChecklistAdd.getJadscApplicationId()) {

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

			sb.append(_SQL_SELECT_JADSCCHECKLISTADD_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JADSCChecklistAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

				list = (List<JADSCChecklistAdd>)QueryUtil.list(
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
	 * Returns the first jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd findBygetJADSCById_First(
			long jadscApplicationId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws NoSuchJADSCChecklistAddException {

		JADSCChecklistAdd jadscChecklistAdd = fetchBygetJADSCById_First(
			jadscApplicationId, orderByComparator);

		if (jadscChecklistAdd != null) {
			return jadscChecklistAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jadscApplicationId=");
		sb.append(jadscApplicationId);

		sb.append("}");

		throw new NoSuchJADSCChecklistAddException(sb.toString());
	}

	/**
	 * Returns the first jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd fetchBygetJADSCById_First(
		long jadscApplicationId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		List<JADSCChecklistAdd> list = findBygetJADSCById(
			jadscApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd findBygetJADSCById_Last(
			long jadscApplicationId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws NoSuchJADSCChecklistAddException {

		JADSCChecklistAdd jadscChecklistAdd = fetchBygetJADSCById_Last(
			jadscApplicationId, orderByComparator);

		if (jadscChecklistAdd != null) {
			return jadscChecklistAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jadscApplicationId=");
		sb.append(jadscApplicationId);

		sb.append("}");

		throw new NoSuchJADSCChecklistAddException(sb.toString());
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd fetchBygetJADSCById_Last(
		long jadscApplicationId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		int count = countBygetJADSCById(jadscApplicationId);

		if (count == 0) {
			return null;
		}

		List<JADSCChecklistAdd> list = findBygetJADSCById(
			jadscApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc checklist adds before and after the current jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jADSCChecklistAddId the primary key of the current jadsc checklist add
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	@Override
	public JADSCChecklistAdd[] findBygetJADSCById_PrevAndNext(
			long jADSCChecklistAddId, long jadscApplicationId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws NoSuchJADSCChecklistAddException {

		JADSCChecklistAdd jadscChecklistAdd = findByPrimaryKey(
			jADSCChecklistAddId);

		Session session = null;

		try {
			session = openSession();

			JADSCChecklistAdd[] array = new JADSCChecklistAddImpl[3];

			array[0] = getBygetJADSCById_PrevAndNext(
				session, jadscChecklistAdd, jadscApplicationId,
				orderByComparator, true);

			array[1] = jadscChecklistAdd;

			array[2] = getBygetJADSCById_PrevAndNext(
				session, jadscChecklistAdd, jadscApplicationId,
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

	protected JADSCChecklistAdd getBygetJADSCById_PrevAndNext(
		Session session, JADSCChecklistAdd jadscChecklistAdd,
		long jadscApplicationId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCCHECKLISTADD_WHERE);

		sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

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
			sb.append(JADSCChecklistAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(jadscApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jadscChecklistAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCChecklistAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc checklist adds where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 */
	@Override
	public void removeBygetJADSCById(long jadscApplicationId) {
		for (JADSCChecklistAdd jadscChecklistAdd :
				findBygetJADSCById(
					jadscApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscChecklistAdd);
		}
	}

	/**
	 * Returns the number of jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc checklist adds
	 */
	@Override
	public int countBygetJADSCById(long jadscApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJADSCById;

		Object[] finderArgs = new Object[] {jadscApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCCHECKLISTADD_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

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
		_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2 =
			"jadscChecklistAdd.jadscApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetAppIdJADSC;
	private FinderPath _finderPathWithoutPaginationFindBygetAppIdJADSC;
	private FinderPath _finderPathCountBygetAppIdJADSC;

	/**
	 * Returns all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findBygetAppIdJADSC(
		long jadscApplicationId) {

		return findBygetAppIdJADSC(
			jadscApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findBygetAppIdJADSC(
		long jadscApplicationId, int start, int end) {

		return findBygetAppIdJADSC(jadscApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findBygetAppIdJADSC(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return findBygetAppIdJADSC(
			jadscApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findBygetAppIdJADSC(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetAppIdJADSC;
				finderArgs = new Object[] {jadscApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAppIdJADSC;
			finderArgs = new Object[] {
				jadscApplicationId, start, end, orderByComparator
			};
		}

		List<JADSCChecklistAdd> list = null;

		if (useFinderCache) {
			list = (List<JADSCChecklistAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCChecklistAdd jadscChecklistAdd : list) {
					if (jadscApplicationId !=
							jadscChecklistAdd.getJadscApplicationId()) {

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

			sb.append(_SQL_SELECT_JADSCCHECKLISTADD_WHERE);

			sb.append(_FINDER_COLUMN_GETAPPIDJADSC_JADSCAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JADSCChecklistAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

				list = (List<JADSCChecklistAdd>)QueryUtil.list(
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
	 * Returns the first jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd findBygetAppIdJADSC_First(
			long jadscApplicationId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws NoSuchJADSCChecklistAddException {

		JADSCChecklistAdd jadscChecklistAdd = fetchBygetAppIdJADSC_First(
			jadscApplicationId, orderByComparator);

		if (jadscChecklistAdd != null) {
			return jadscChecklistAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jadscApplicationId=");
		sb.append(jadscApplicationId);

		sb.append("}");

		throw new NoSuchJADSCChecklistAddException(sb.toString());
	}

	/**
	 * Returns the first jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd fetchBygetAppIdJADSC_First(
		long jadscApplicationId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		List<JADSCChecklistAdd> list = findBygetAppIdJADSC(
			jadscApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd findBygetAppIdJADSC_Last(
			long jadscApplicationId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws NoSuchJADSCChecklistAddException {

		JADSCChecklistAdd jadscChecklistAdd = fetchBygetAppIdJADSC_Last(
			jadscApplicationId, orderByComparator);

		if (jadscChecklistAdd != null) {
			return jadscChecklistAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jadscApplicationId=");
		sb.append(jadscApplicationId);

		sb.append("}");

		throw new NoSuchJADSCChecklistAddException(sb.toString());
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	@Override
	public JADSCChecklistAdd fetchBygetAppIdJADSC_Last(
		long jadscApplicationId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		int count = countBygetAppIdJADSC(jadscApplicationId);

		if (count == 0) {
			return null;
		}

		List<JADSCChecklistAdd> list = findBygetAppIdJADSC(
			jadscApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc checklist adds before and after the current jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jADSCChecklistAddId the primary key of the current jadsc checklist add
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	@Override
	public JADSCChecklistAdd[] findBygetAppIdJADSC_PrevAndNext(
			long jADSCChecklistAddId, long jadscApplicationId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws NoSuchJADSCChecklistAddException {

		JADSCChecklistAdd jadscChecklistAdd = findByPrimaryKey(
			jADSCChecklistAddId);

		Session session = null;

		try {
			session = openSession();

			JADSCChecklistAdd[] array = new JADSCChecklistAddImpl[3];

			array[0] = getBygetAppIdJADSC_PrevAndNext(
				session, jadscChecklistAdd, jadscApplicationId,
				orderByComparator, true);

			array[1] = jadscChecklistAdd;

			array[2] = getBygetAppIdJADSC_PrevAndNext(
				session, jadscChecklistAdd, jadscApplicationId,
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

	protected JADSCChecklistAdd getBygetAppIdJADSC_PrevAndNext(
		Session session, JADSCChecklistAdd jadscChecklistAdd,
		long jadscApplicationId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCCHECKLISTADD_WHERE);

		sb.append(_FINDER_COLUMN_GETAPPIDJADSC_JADSCAPPLICATIONID_2);

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
			sb.append(JADSCChecklistAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(jadscApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jadscChecklistAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCChecklistAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc checklist adds where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 */
	@Override
	public void removeBygetAppIdJADSC(long jadscApplicationId) {
		for (JADSCChecklistAdd jadscChecklistAdd :
				findBygetAppIdJADSC(
					jadscApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscChecklistAdd);
		}
	}

	/**
	 * Returns the number of jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc checklist adds
	 */
	@Override
	public int countBygetAppIdJADSC(long jadscApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAppIdJADSC;

		Object[] finderArgs = new Object[] {jadscApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCCHECKLISTADD_WHERE);

			sb.append(_FINDER_COLUMN_GETAPPIDJADSC_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

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
		_FINDER_COLUMN_GETAPPIDJADSC_JADSCAPPLICATIONID_2 =
			"jadscChecklistAdd.jadscApplicationId = ?";

	public JADSCChecklistAddPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JADSCChecklistAdd.class);

		setModelImplClass(JADSCChecklistAddImpl.class);
		setModelPKClass(long.class);

		setTable(JADSCChecklistAddTable.INSTANCE);
	}

	/**
	 * Caches the jadsc checklist add in the entity cache if it is enabled.
	 *
	 * @param jadscChecklistAdd the jadsc checklist add
	 */
	@Override
	public void cacheResult(JADSCChecklistAdd jadscChecklistAdd) {
		entityCache.putResult(
			JADSCChecklistAddImpl.class, jadscChecklistAdd.getPrimaryKey(),
			jadscChecklistAdd);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				jadscChecklistAdd.getUuid(), jadscChecklistAdd.getGroupId()
			},
			jadscChecklistAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc checklist adds in the entity cache if it is enabled.
	 *
	 * @param jadscChecklistAdds the jadsc checklist adds
	 */
	@Override
	public void cacheResult(List<JADSCChecklistAdd> jadscChecklistAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscChecklistAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JADSCChecklistAdd jadscChecklistAdd : jadscChecklistAdds) {
			if (entityCache.getResult(
					JADSCChecklistAddImpl.class,
					jadscChecklistAdd.getPrimaryKey()) == null) {

				cacheResult(jadscChecklistAdd);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc checklist adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JADSCChecklistAddImpl.class);

		finderCache.clearCache(JADSCChecklistAddImpl.class);
	}

	/**
	 * Clears the cache for the jadsc checklist add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JADSCChecklistAdd jadscChecklistAdd) {
		entityCache.removeResult(
			JADSCChecklistAddImpl.class, jadscChecklistAdd);
	}

	@Override
	public void clearCache(List<JADSCChecklistAdd> jadscChecklistAdds) {
		for (JADSCChecklistAdd jadscChecklistAdd : jadscChecklistAdds) {
			entityCache.removeResult(
				JADSCChecklistAddImpl.class, jadscChecklistAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JADSCChecklistAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(JADSCChecklistAddImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JADSCChecklistAddModelImpl jadscChecklistAddModelImpl) {

		Object[] args = new Object[] {
			jadscChecklistAddModelImpl.getUuid(),
			jadscChecklistAddModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, jadscChecklistAddModelImpl);
	}

	/**
	 * Creates a new jadsc checklist add with the primary key. Does not add the jadsc checklist add to the database.
	 *
	 * @param jADSCChecklistAddId the primary key for the new jadsc checklist add
	 * @return the new jadsc checklist add
	 */
	@Override
	public JADSCChecklistAdd create(long jADSCChecklistAddId) {
		JADSCChecklistAdd jadscChecklistAdd = new JADSCChecklistAddImpl();

		jadscChecklistAdd.setNew(true);
		jadscChecklistAdd.setPrimaryKey(jADSCChecklistAddId);

		String uuid = PortalUUIDUtil.generate();

		jadscChecklistAdd.setUuid(uuid);

		jadscChecklistAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jadscChecklistAdd;
	}

	/**
	 * Removes the jadsc checklist add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jADSCChecklistAddId the primary key of the jadsc checklist add
	 * @return the jadsc checklist add that was removed
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	@Override
	public JADSCChecklistAdd remove(long jADSCChecklistAddId)
		throws NoSuchJADSCChecklistAddException {

		return remove((Serializable)jADSCChecklistAddId);
	}

	/**
	 * Removes the jadsc checklist add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc checklist add
	 * @return the jadsc checklist add that was removed
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	@Override
	public JADSCChecklistAdd remove(Serializable primaryKey)
		throws NoSuchJADSCChecklistAddException {

		Session session = null;

		try {
			session = openSession();

			JADSCChecklistAdd jadscChecklistAdd =
				(JADSCChecklistAdd)session.get(
					JADSCChecklistAddImpl.class, primaryKey);

			if (jadscChecklistAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJADSCChecklistAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscChecklistAdd);
		}
		catch (NoSuchJADSCChecklistAddException noSuchEntityException) {
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
	protected JADSCChecklistAdd removeImpl(
		JADSCChecklistAdd jadscChecklistAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscChecklistAdd)) {
				jadscChecklistAdd = (JADSCChecklistAdd)session.get(
					JADSCChecklistAddImpl.class,
					jadscChecklistAdd.getPrimaryKeyObj());
			}

			if (jadscChecklistAdd != null) {
				session.delete(jadscChecklistAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscChecklistAdd != null) {
			clearCache(jadscChecklistAdd);
		}

		return jadscChecklistAdd;
	}

	@Override
	public JADSCChecklistAdd updateImpl(JADSCChecklistAdd jadscChecklistAdd) {
		boolean isNew = jadscChecklistAdd.isNew();

		if (!(jadscChecklistAdd instanceof JADSCChecklistAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jadscChecklistAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscChecklistAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscChecklistAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JADSCChecklistAdd implementation " +
					jadscChecklistAdd.getClass());
		}

		JADSCChecklistAddModelImpl jadscChecklistAddModelImpl =
			(JADSCChecklistAddModelImpl)jadscChecklistAdd;

		if (Validator.isNull(jadscChecklistAdd.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			jadscChecklistAdd.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscChecklistAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscChecklistAdd.setCreateDate(date);
			}
			else {
				jadscChecklistAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscChecklistAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscChecklistAdd.setModifiedDate(date);
			}
			else {
				jadscChecklistAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscChecklistAdd);
			}
			else {
				jadscChecklistAdd = (JADSCChecklistAdd)session.merge(
					jadscChecklistAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JADSCChecklistAddImpl.class, jadscChecklistAddModelImpl, false,
			true);

		cacheUniqueFindersCache(jadscChecklistAddModelImpl);

		if (isNew) {
			jadscChecklistAdd.setNew(false);
		}

		jadscChecklistAdd.resetOriginalValues();

		return jadscChecklistAdd;
	}

	/**
	 * Returns the jadsc checklist add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc checklist add
	 * @return the jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	@Override
	public JADSCChecklistAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJADSCChecklistAddException {

		JADSCChecklistAdd jadscChecklistAdd = fetchByPrimaryKey(primaryKey);

		if (jadscChecklistAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJADSCChecklistAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscChecklistAdd;
	}

	/**
	 * Returns the jadsc checklist add with the primary key or throws a <code>NoSuchJADSCChecklistAddException</code> if it could not be found.
	 *
	 * @param jADSCChecklistAddId the primary key of the jadsc checklist add
	 * @return the jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	@Override
	public JADSCChecklistAdd findByPrimaryKey(long jADSCChecklistAddId)
		throws NoSuchJADSCChecklistAddException {

		return findByPrimaryKey((Serializable)jADSCChecklistAddId);
	}

	/**
	 * Returns the jadsc checklist add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jADSCChecklistAddId the primary key of the jadsc checklist add
	 * @return the jadsc checklist add, or <code>null</code> if a jadsc checklist add with the primary key could not be found
	 */
	@Override
	public JADSCChecklistAdd fetchByPrimaryKey(long jADSCChecklistAddId) {
		return fetchByPrimaryKey((Serializable)jADSCChecklistAddId);
	}

	/**
	 * Returns all the jadsc checklist adds.
	 *
	 * @return the jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc checklist adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findAll(
		int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc checklist adds
	 */
	@Override
	public List<JADSCChecklistAdd> findAll(
		int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator,
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

		List<JADSCChecklistAdd> list = null;

		if (useFinderCache) {
			list = (List<JADSCChecklistAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCCHECKLISTADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCCHECKLISTADD;

				sql = sql.concat(JADSCChecklistAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JADSCChecklistAdd>)QueryUtil.list(
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
	 * Removes all the jadsc checklist adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JADSCChecklistAdd jadscChecklistAdd : findAll()) {
			remove(jadscChecklistAdd);
		}
	}

	/**
	 * Returns the number of jadsc checklist adds.
	 *
	 * @return the number of jadsc checklist adds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_JADSCCHECKLISTADD);

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
		return "jADSCChecklistAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCCHECKLISTADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JADSCChecklistAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc checklist add persistence.
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

		_finderPathWithPaginationFindBygetJADSCById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJADSCById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"jadscApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJADSCById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJADSCById",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, true);

		_finderPathCountBygetJADSCById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJADSCById",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, false);

		_finderPathWithPaginationFindBygetAppIdJADSC = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAppIdJADSC",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"jadscApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetAppIdJADSC = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetAppIdJADSC",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, true);

		_finderPathCountBygetAppIdJADSC = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAppIdJADSC",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, false);

		JADSCChecklistAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JADSCChecklistAddUtil.setPersistence(null);

		entityCache.removeCache(JADSCChecklistAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JADSCCHECKLISTADD =
		"SELECT jadscChecklistAdd FROM JADSCChecklistAdd jadscChecklistAdd";

	private static final String _SQL_SELECT_JADSCCHECKLISTADD_WHERE =
		"SELECT jadscChecklistAdd FROM JADSCChecklistAdd jadscChecklistAdd WHERE ";

	private static final String _SQL_COUNT_JADSCCHECKLISTADD =
		"SELECT COUNT(jadscChecklistAdd) FROM JADSCChecklistAdd jadscChecklistAdd";

	private static final String _SQL_COUNT_JADSCCHECKLISTADD_WHERE =
		"SELECT COUNT(jadscChecklistAdd) FROM JADSCChecklistAdd jadscChecklistAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "jadscChecklistAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JADSCChecklistAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JADSCChecklistAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JADSCChecklistAddPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}