/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.janaac.application.form.service.exception.NoSuchAccMediLabTestStructuralException;
import com.nbp.janaac.application.form.service.model.AccMediLabTestStructural;
import com.nbp.janaac.application.form.service.model.AccMediLabTestStructuralTable;
import com.nbp.janaac.application.form.service.model.impl.AccMediLabTestStructuralImpl;
import com.nbp.janaac.application.form.service.model.impl.AccMediLabTestStructuralModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AccMediLabTestStructuralPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccMediLabTestStructuralUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
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
 * The persistence implementation for the acc medi lab test structural service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AccMediLabTestStructuralPersistence.class)
public class AccMediLabTestStructuralPersistenceImpl
	extends BasePersistenceImpl<AccMediLabTestStructural>
	implements AccMediLabTestStructuralPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AccMediLabTestStructuralUtil</code> to access the acc medi lab test structural persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AccMediLabTestStructuralImpl.class.getName();

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
	 * Returns all the acc medi lab test structurals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc medi lab test structurals
	 */
	@Override
	public List<AccMediLabTestStructural> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acc medi lab test structurals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @return the range of matching acc medi lab test structurals
	 */
	@Override
	public List<AccMediLabTestStructural> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acc medi lab test structurals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab test structurals
	 */
	@Override
	public List<AccMediLabTestStructural> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccMediLabTestStructural> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acc medi lab test structurals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab test structurals
	 */
	@Override
	public List<AccMediLabTestStructural> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccMediLabTestStructural> orderByComparator,
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

		List<AccMediLabTestStructural> list = null;

		if (useFinderCache) {
			list = (List<AccMediLabTestStructural>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccMediLabTestStructural accMediLabTestStructural : list) {
					if (!uuid.equals(accMediLabTestStructural.getUuid())) {
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

			sb.append(_SQL_SELECT_ACCMEDILABTESTSTRUCTURAL_WHERE);

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
				sb.append(AccMediLabTestStructuralModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccMediLabTestStructural>)QueryUtil.list(
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
	 * Returns the first acc medi lab test structural in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural findByUuid_First(
			String uuid,
			OrderByComparator<AccMediLabTestStructural> orderByComparator)
		throws NoSuchAccMediLabTestStructuralException {

		AccMediLabTestStructural accMediLabTestStructural = fetchByUuid_First(
			uuid, orderByComparator);

		if (accMediLabTestStructural != null) {
			return accMediLabTestStructural;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccMediLabTestStructuralException(sb.toString());
	}

	/**
	 * Returns the first acc medi lab test structural in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural fetchByUuid_First(
		String uuid,
		OrderByComparator<AccMediLabTestStructural> orderByComparator) {

		List<AccMediLabTestStructural> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acc medi lab test structural in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural findByUuid_Last(
			String uuid,
			OrderByComparator<AccMediLabTestStructural> orderByComparator)
		throws NoSuchAccMediLabTestStructuralException {

		AccMediLabTestStructural accMediLabTestStructural = fetchByUuid_Last(
			uuid, orderByComparator);

		if (accMediLabTestStructural != null) {
			return accMediLabTestStructural;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccMediLabTestStructuralException(sb.toString());
	}

	/**
	 * Returns the last acc medi lab test structural in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural fetchByUuid_Last(
		String uuid,
		OrderByComparator<AccMediLabTestStructural> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AccMediLabTestStructural> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acc medi lab test structurals before and after the current acc medi lab test structural in the ordered set where uuid = &#63;.
	 *
	 * @param accMediLabTestStructuralId the primary key of the current acc medi lab test structural
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a acc medi lab test structural with the primary key could not be found
	 */
	@Override
	public AccMediLabTestStructural[] findByUuid_PrevAndNext(
			long accMediLabTestStructuralId, String uuid,
			OrderByComparator<AccMediLabTestStructural> orderByComparator)
		throws NoSuchAccMediLabTestStructuralException {

		uuid = Objects.toString(uuid, "");

		AccMediLabTestStructural accMediLabTestStructural = findByPrimaryKey(
			accMediLabTestStructuralId);

		Session session = null;

		try {
			session = openSession();

			AccMediLabTestStructural[] array =
				new AccMediLabTestStructuralImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, accMediLabTestStructural, uuid, orderByComparator,
				true);

			array[1] = accMediLabTestStructural;

			array[2] = getByUuid_PrevAndNext(
				session, accMediLabTestStructural, uuid, orderByComparator,
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

	protected AccMediLabTestStructural getByUuid_PrevAndNext(
		Session session, AccMediLabTestStructural accMediLabTestStructural,
		String uuid,
		OrderByComparator<AccMediLabTestStructural> orderByComparator,
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

		sb.append(_SQL_SELECT_ACCMEDILABTESTSTRUCTURAL_WHERE);

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
			sb.append(AccMediLabTestStructuralModelImpl.ORDER_BY_JPQL);
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
						accMediLabTestStructural)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccMediLabTestStructural> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acc medi lab test structurals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AccMediLabTestStructural accMediLabTestStructural :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(accMediLabTestStructural);
		}
	}

	/**
	 * Returns the number of acc medi lab test structurals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc medi lab test structurals
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCMEDILABTESTSTRUCTURAL_WHERE);

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
		"accMediLabTestStructural.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(accMediLabTestStructural.uuid IS NULL OR accMediLabTestStructural.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the acc medi lab test structural where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccMediLabTestStructuralException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural findByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabTestStructuralException {

		AccMediLabTestStructural accMediLabTestStructural = fetchByUUID_G(
			uuid, groupId);

		if (accMediLabTestStructural == null) {
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

			throw new NoSuchAccMediLabTestStructuralException(sb.toString());
		}

		return accMediLabTestStructural;
	}

	/**
	 * Returns the acc medi lab test structural where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the acc medi lab test structural where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural fetchByUUID_G(
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

		if (result instanceof AccMediLabTestStructural) {
			AccMediLabTestStructural accMediLabTestStructural =
				(AccMediLabTestStructural)result;

			if (!Objects.equals(uuid, accMediLabTestStructural.getUuid()) ||
				(groupId != accMediLabTestStructural.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ACCMEDILABTESTSTRUCTURAL_WHERE);

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

				List<AccMediLabTestStructural> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					AccMediLabTestStructural accMediLabTestStructural =
						list.get(0);

					result = accMediLabTestStructural;

					cacheResult(accMediLabTestStructural);
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
			return (AccMediLabTestStructural)result;
		}
	}

	/**
	 * Removes the acc medi lab test structural where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc medi lab test structural that was removed
	 */
	@Override
	public AccMediLabTestStructural removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccMediLabTestStructuralException {

		AccMediLabTestStructural accMediLabTestStructural = findByUUID_G(
			uuid, groupId);

		return remove(accMediLabTestStructural);
	}

	/**
	 * Returns the number of acc medi lab test structurals where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc medi lab test structurals
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCMEDILABTESTSTRUCTURAL_WHERE);

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
		"accMediLabTestStructural.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(accMediLabTestStructural.uuid IS NULL OR accMediLabTestStructural.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"accMediLabTestStructural.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the acc medi lab test structurals where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc medi lab test structurals
	 */
	@Override
	public List<AccMediLabTestStructural> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acc medi lab test structurals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @return the range of matching acc medi lab test structurals
	 */
	@Override
	public List<AccMediLabTestStructural> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acc medi lab test structurals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab test structurals
	 */
	@Override
	public List<AccMediLabTestStructural> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccMediLabTestStructural> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acc medi lab test structurals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab test structurals
	 */
	@Override
	public List<AccMediLabTestStructural> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccMediLabTestStructural> orderByComparator,
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

		List<AccMediLabTestStructural> list = null;

		if (useFinderCache) {
			list = (List<AccMediLabTestStructural>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccMediLabTestStructural accMediLabTestStructural : list) {
					if (!uuid.equals(accMediLabTestStructural.getUuid()) ||
						(companyId !=
							accMediLabTestStructural.getCompanyId())) {

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

			sb.append(_SQL_SELECT_ACCMEDILABTESTSTRUCTURAL_WHERE);

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
				sb.append(AccMediLabTestStructuralModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccMediLabTestStructural>)QueryUtil.list(
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
	 * Returns the first acc medi lab test structural in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccMediLabTestStructural> orderByComparator)
		throws NoSuchAccMediLabTestStructuralException {

		AccMediLabTestStructural accMediLabTestStructural = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (accMediLabTestStructural != null) {
			return accMediLabTestStructural;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccMediLabTestStructuralException(sb.toString());
	}

	/**
	 * Returns the first acc medi lab test structural in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccMediLabTestStructural> orderByComparator) {

		List<AccMediLabTestStructural> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acc medi lab test structural in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccMediLabTestStructural> orderByComparator)
		throws NoSuchAccMediLabTestStructuralException {

		AccMediLabTestStructural accMediLabTestStructural = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (accMediLabTestStructural != null) {
			return accMediLabTestStructural;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccMediLabTestStructuralException(sb.toString());
	}

	/**
	 * Returns the last acc medi lab test structural in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccMediLabTestStructural> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<AccMediLabTestStructural> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acc medi lab test structurals before and after the current acc medi lab test structural in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accMediLabTestStructuralId the primary key of the current acc medi lab test structural
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a acc medi lab test structural with the primary key could not be found
	 */
	@Override
	public AccMediLabTestStructural[] findByUuid_C_PrevAndNext(
			long accMediLabTestStructuralId, String uuid, long companyId,
			OrderByComparator<AccMediLabTestStructural> orderByComparator)
		throws NoSuchAccMediLabTestStructuralException {

		uuid = Objects.toString(uuid, "");

		AccMediLabTestStructural accMediLabTestStructural = findByPrimaryKey(
			accMediLabTestStructuralId);

		Session session = null;

		try {
			session = openSession();

			AccMediLabTestStructural[] array =
				new AccMediLabTestStructuralImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, accMediLabTestStructural, uuid, companyId,
				orderByComparator, true);

			array[1] = accMediLabTestStructural;

			array[2] = getByUuid_C_PrevAndNext(
				session, accMediLabTestStructural, uuid, companyId,
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

	protected AccMediLabTestStructural getByUuid_C_PrevAndNext(
		Session session, AccMediLabTestStructural accMediLabTestStructural,
		String uuid, long companyId,
		OrderByComparator<AccMediLabTestStructural> orderByComparator,
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

		sb.append(_SQL_SELECT_ACCMEDILABTESTSTRUCTURAL_WHERE);

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
			sb.append(AccMediLabTestStructuralModelImpl.ORDER_BY_JPQL);
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
						accMediLabTestStructural)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccMediLabTestStructural> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acc medi lab test structurals where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (AccMediLabTestStructural accMediLabTestStructural :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(accMediLabTestStructural);
		}
	}

	/**
	 * Returns the number of acc medi lab test structurals where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc medi lab test structurals
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCMEDILABTESTSTRUCTURAL_WHERE);

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
		"accMediLabTestStructural.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(accMediLabTestStructural.uuid IS NULL OR accMediLabTestStructural.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"accMediLabTestStructural.companyId = ?";

	private FinderPath _finderPathFetchBygetJANAAC_ByApplicationId;
	private FinderPath _finderPathCountBygetJANAAC_ByApplicationId;

	/**
	 * Returns the acc medi lab test structural where janaacApplicationId = &#63; or throws a <code>NoSuchAccMediLabTestStructuralException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabTestStructuralException {

		AccMediLabTestStructural accMediLabTestStructural =
			fetchBygetJANAAC_ByApplicationId(janaacApplicationId);

		if (accMediLabTestStructural == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("janaacApplicationId=");
			sb.append(janaacApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAccMediLabTestStructuralException(sb.toString());
		}

		return accMediLabTestStructural;
	}

	/**
	 * Returns the acc medi lab test structural where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return fetchBygetJANAAC_ByApplicationId(janaacApplicationId, true);
	}

	/**
	 * Returns the acc medi lab test structural where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab test structural, or <code>null</code> if a matching acc medi lab test structural could not be found
	 */
	@Override
	public AccMediLabTestStructural fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {janaacApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJANAAC_ByApplicationId, finderArgs, this);
		}

		if (result instanceof AccMediLabTestStructural) {
			AccMediLabTestStructural accMediLabTestStructural =
				(AccMediLabTestStructural)result;

			if (janaacApplicationId !=
					accMediLabTestStructural.getJanaacApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACCMEDILABTESTSTRUCTURAL_WHERE);

			sb.append(
				_FINDER_COLUMN_GETJANAAC_BYAPPLICATIONID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				List<AccMediLabTestStructural> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJANAAC_ByApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {janaacApplicationId};
							}

							_log.warn(
								"AccMediLabTestStructuralPersistenceImpl.fetchBygetJANAAC_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AccMediLabTestStructural accMediLabTestStructural =
						list.get(0);

					result = accMediLabTestStructural;

					cacheResult(accMediLabTestStructural);
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
			return (AccMediLabTestStructural)result;
		}
	}

	/**
	 * Removes the acc medi lab test structural where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc medi lab test structural that was removed
	 */
	@Override
	public AccMediLabTestStructural removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabTestStructuralException {

		AccMediLabTestStructural accMediLabTestStructural =
			findBygetJANAAC_ByApplicationId(janaacApplicationId);

		return remove(accMediLabTestStructural);
	}

	/**
	 * Returns the number of acc medi lab test structurals where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc medi lab test structurals
	 */
	@Override
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJANAAC_ByApplicationId;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCMEDILABTESTSTRUCTURAL_WHERE);

			sb.append(
				_FINDER_COLUMN_GETJANAAC_BYAPPLICATIONID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAAC_BYAPPLICATIONID_JANAACAPPLICATIONID_2 =
			"accMediLabTestStructural.janaacApplicationId = ?";

	public AccMediLabTestStructuralPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AccMediLabTestStructural.class);

		setModelImplClass(AccMediLabTestStructuralImpl.class);
		setModelPKClass(long.class);

		setTable(AccMediLabTestStructuralTable.INSTANCE);
	}

	/**
	 * Caches the acc medi lab test structural in the entity cache if it is enabled.
	 *
	 * @param accMediLabTestStructural the acc medi lab test structural
	 */
	@Override
	public void cacheResult(AccMediLabTestStructural accMediLabTestStructural) {
		entityCache.putResult(
			AccMediLabTestStructuralImpl.class,
			accMediLabTestStructural.getPrimaryKey(), accMediLabTestStructural);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				accMediLabTestStructural.getUuid(),
				accMediLabTestStructural.getGroupId()
			},
			accMediLabTestStructural);

		finderCache.putResult(
			_finderPathFetchBygetJANAAC_ByApplicationId,
			new Object[] {accMediLabTestStructural.getJanaacApplicationId()},
			accMediLabTestStructural);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acc medi lab test structurals in the entity cache if it is enabled.
	 *
	 * @param accMediLabTestStructurals the acc medi lab test structurals
	 */
	@Override
	public void cacheResult(
		List<AccMediLabTestStructural> accMediLabTestStructurals) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (accMediLabTestStructurals.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AccMediLabTestStructural accMediLabTestStructural :
				accMediLabTestStructurals) {

			if (entityCache.getResult(
					AccMediLabTestStructuralImpl.class,
					accMediLabTestStructural.getPrimaryKey()) == null) {

				cacheResult(accMediLabTestStructural);
			}
		}
	}

	/**
	 * Clears the cache for all acc medi lab test structurals.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AccMediLabTestStructuralImpl.class);

		finderCache.clearCache(AccMediLabTestStructuralImpl.class);
	}

	/**
	 * Clears the cache for the acc medi lab test structural.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccMediLabTestStructural accMediLabTestStructural) {
		entityCache.removeResult(
			AccMediLabTestStructuralImpl.class, accMediLabTestStructural);
	}

	@Override
	public void clearCache(
		List<AccMediLabTestStructural> accMediLabTestStructurals) {

		for (AccMediLabTestStructural accMediLabTestStructural :
				accMediLabTestStructurals) {

			entityCache.removeResult(
				AccMediLabTestStructuralImpl.class, accMediLabTestStructural);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AccMediLabTestStructuralImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AccMediLabTestStructuralImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AccMediLabTestStructuralModelImpl accMediLabTestStructuralModelImpl) {

		Object[] args = new Object[] {
			accMediLabTestStructuralModelImpl.getUuid(),
			accMediLabTestStructuralModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, accMediLabTestStructuralModelImpl);

		args = new Object[] {
			accMediLabTestStructuralModelImpl.getJanaacApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJANAAC_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJANAAC_ByApplicationId, args,
			accMediLabTestStructuralModelImpl);
	}

	/**
	 * Creates a new acc medi lab test structural with the primary key. Does not add the acc medi lab test structural to the database.
	 *
	 * @param accMediLabTestStructuralId the primary key for the new acc medi lab test structural
	 * @return the new acc medi lab test structural
	 */
	@Override
	public AccMediLabTestStructural create(long accMediLabTestStructuralId) {
		AccMediLabTestStructural accMediLabTestStructural =
			new AccMediLabTestStructuralImpl();

		accMediLabTestStructural.setNew(true);
		accMediLabTestStructural.setPrimaryKey(accMediLabTestStructuralId);

		String uuid = PortalUUIDUtil.generate();

		accMediLabTestStructural.setUuid(uuid);

		accMediLabTestStructural.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return accMediLabTestStructural;
	}

	/**
	 * Removes the acc medi lab test structural with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accMediLabTestStructuralId the primary key of the acc medi lab test structural
	 * @return the acc medi lab test structural that was removed
	 * @throws NoSuchAccMediLabTestStructuralException if a acc medi lab test structural with the primary key could not be found
	 */
	@Override
	public AccMediLabTestStructural remove(long accMediLabTestStructuralId)
		throws NoSuchAccMediLabTestStructuralException {

		return remove((Serializable)accMediLabTestStructuralId);
	}

	/**
	 * Removes the acc medi lab test structural with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acc medi lab test structural
	 * @return the acc medi lab test structural that was removed
	 * @throws NoSuchAccMediLabTestStructuralException if a acc medi lab test structural with the primary key could not be found
	 */
	@Override
	public AccMediLabTestStructural remove(Serializable primaryKey)
		throws NoSuchAccMediLabTestStructuralException {

		Session session = null;

		try {
			session = openSession();

			AccMediLabTestStructural accMediLabTestStructural =
				(AccMediLabTestStructural)session.get(
					AccMediLabTestStructuralImpl.class, primaryKey);

			if (accMediLabTestStructural == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccMediLabTestStructuralException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(accMediLabTestStructural);
		}
		catch (NoSuchAccMediLabTestStructuralException noSuchEntityException) {
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
	protected AccMediLabTestStructural removeImpl(
		AccMediLabTestStructural accMediLabTestStructural) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(accMediLabTestStructural)) {
				accMediLabTestStructural =
					(AccMediLabTestStructural)session.get(
						AccMediLabTestStructuralImpl.class,
						accMediLabTestStructural.getPrimaryKeyObj());
			}

			if (accMediLabTestStructural != null) {
				session.delete(accMediLabTestStructural);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (accMediLabTestStructural != null) {
			clearCache(accMediLabTestStructural);
		}

		return accMediLabTestStructural;
	}

	@Override
	public AccMediLabTestStructural updateImpl(
		AccMediLabTestStructural accMediLabTestStructural) {

		boolean isNew = accMediLabTestStructural.isNew();

		if (!(accMediLabTestStructural instanceof
				AccMediLabTestStructuralModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(accMediLabTestStructural.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					accMediLabTestStructural);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in accMediLabTestStructural proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AccMediLabTestStructural implementation " +
					accMediLabTestStructural.getClass());
		}

		AccMediLabTestStructuralModelImpl accMediLabTestStructuralModelImpl =
			(AccMediLabTestStructuralModelImpl)accMediLabTestStructural;

		if (Validator.isNull(accMediLabTestStructural.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			accMediLabTestStructural.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (accMediLabTestStructural.getCreateDate() == null)) {
			if (serviceContext == null) {
				accMediLabTestStructural.setCreateDate(date);
			}
			else {
				accMediLabTestStructural.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!accMediLabTestStructuralModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				accMediLabTestStructural.setModifiedDate(date);
			}
			else {
				accMediLabTestStructural.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(accMediLabTestStructural);
			}
			else {
				accMediLabTestStructural =
					(AccMediLabTestStructural)session.merge(
						accMediLabTestStructural);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AccMediLabTestStructuralImpl.class,
			accMediLabTestStructuralModelImpl, false, true);

		cacheUniqueFindersCache(accMediLabTestStructuralModelImpl);

		if (isNew) {
			accMediLabTestStructural.setNew(false);
		}

		accMediLabTestStructural.resetOriginalValues();

		return accMediLabTestStructural;
	}

	/**
	 * Returns the acc medi lab test structural with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acc medi lab test structural
	 * @return the acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a acc medi lab test structural with the primary key could not be found
	 */
	@Override
	public AccMediLabTestStructural findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAccMediLabTestStructuralException {

		AccMediLabTestStructural accMediLabTestStructural = fetchByPrimaryKey(
			primaryKey);

		if (accMediLabTestStructural == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAccMediLabTestStructuralException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return accMediLabTestStructural;
	}

	/**
	 * Returns the acc medi lab test structural with the primary key or throws a <code>NoSuchAccMediLabTestStructuralException</code> if it could not be found.
	 *
	 * @param accMediLabTestStructuralId the primary key of the acc medi lab test structural
	 * @return the acc medi lab test structural
	 * @throws NoSuchAccMediLabTestStructuralException if a acc medi lab test structural with the primary key could not be found
	 */
	@Override
	public AccMediLabTestStructural findByPrimaryKey(
			long accMediLabTestStructuralId)
		throws NoSuchAccMediLabTestStructuralException {

		return findByPrimaryKey((Serializable)accMediLabTestStructuralId);
	}

	/**
	 * Returns the acc medi lab test structural with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accMediLabTestStructuralId the primary key of the acc medi lab test structural
	 * @return the acc medi lab test structural, or <code>null</code> if a acc medi lab test structural with the primary key could not be found
	 */
	@Override
	public AccMediLabTestStructural fetchByPrimaryKey(
		long accMediLabTestStructuralId) {

		return fetchByPrimaryKey((Serializable)accMediLabTestStructuralId);
	}

	/**
	 * Returns all the acc medi lab test structurals.
	 *
	 * @return the acc medi lab test structurals
	 */
	@Override
	public List<AccMediLabTestStructural> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acc medi lab test structurals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @return the range of acc medi lab test structurals
	 */
	@Override
	public List<AccMediLabTestStructural> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acc medi lab test structurals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc medi lab test structurals
	 */
	@Override
	public List<AccMediLabTestStructural> findAll(
		int start, int end,
		OrderByComparator<AccMediLabTestStructural> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acc medi lab test structurals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestStructuralModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test structurals
	 * @param end the upper bound of the range of acc medi lab test structurals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc medi lab test structurals
	 */
	@Override
	public List<AccMediLabTestStructural> findAll(
		int start, int end,
		OrderByComparator<AccMediLabTestStructural> orderByComparator,
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

		List<AccMediLabTestStructural> list = null;

		if (useFinderCache) {
			list = (List<AccMediLabTestStructural>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACCMEDILABTESTSTRUCTURAL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACCMEDILABTESTSTRUCTURAL;

				sql = sql.concat(
					AccMediLabTestStructuralModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AccMediLabTestStructural>)QueryUtil.list(
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
	 * Removes all the acc medi lab test structurals from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AccMediLabTestStructural accMediLabTestStructural : findAll()) {
			remove(accMediLabTestStructural);
		}
	}

	/**
	 * Returns the number of acc medi lab test structurals.
	 *
	 * @return the number of acc medi lab test structurals
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
					_SQL_COUNT_ACCMEDILABTESTSTRUCTURAL);

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
		return "accMediLabTestStructuralId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACCMEDILABTESTSTRUCTURAL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AccMediLabTestStructuralModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acc medi lab test structural persistence.
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

		_finderPathFetchBygetJANAAC_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJANAAC_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJANAAC_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJANAAC_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AccMediLabTestStructuralUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AccMediLabTestStructuralUtil.setPersistence(null);

		entityCache.removeCache(AccMediLabTestStructuralImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACCMEDILABTESTSTRUCTURAL =
		"SELECT accMediLabTestStructural FROM AccMediLabTestStructural accMediLabTestStructural";

	private static final String _SQL_SELECT_ACCMEDILABTESTSTRUCTURAL_WHERE =
		"SELECT accMediLabTestStructural FROM AccMediLabTestStructural accMediLabTestStructural WHERE ";

	private static final String _SQL_COUNT_ACCMEDILABTESTSTRUCTURAL =
		"SELECT COUNT(accMediLabTestStructural) FROM AccMediLabTestStructural accMediLabTestStructural";

	private static final String _SQL_COUNT_ACCMEDILABTESTSTRUCTURAL_WHERE =
		"SELECT COUNT(accMediLabTestStructural) FROM AccMediLabTestStructural accMediLabTestStructural WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"accMediLabTestStructural.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AccMediLabTestStructural exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AccMediLabTestStructural exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AccMediLabTestStructuralPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}