/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence.impl;

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

import com.nbp.osi.application.form.services.exception.NoSuchEducationalQualificationException;
import com.nbp.osi.application.form.services.model.EducationalQualification;
import com.nbp.osi.application.form.services.model.EducationalQualificationTable;
import com.nbp.osi.application.form.services.model.impl.EducationalQualificationImpl;
import com.nbp.osi.application.form.services.model.impl.EducationalQualificationModelImpl;
import com.nbp.osi.application.form.services.service.persistence.EducationalQualificationPersistence;
import com.nbp.osi.application.form.services.service.persistence.EducationalQualificationUtil;
import com.nbp.osi.application.form.services.service.persistence.impl.constants.OSIPersistenceConstants;

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
 * The persistence implementation for the educational qualification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = EducationalQualificationPersistence.class)
public class EducationalQualificationPersistenceImpl
	extends BasePersistenceImpl<EducationalQualification>
	implements EducationalQualificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EducationalQualificationUtil</code> to access the educational qualification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EducationalQualificationImpl.class.getName();

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
	 * Returns all the educational qualifications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching educational qualifications
	 */
	@Override
	public List<EducationalQualification> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<EducationalQualification> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<EducationalQualification> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<EducationalQualification> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator,
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

		List<EducationalQualification> list = null;

		if (useFinderCache) {
			list = (List<EducationalQualification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EducationalQualification educationalQualification : list) {
					if (!uuid.equals(educationalQualification.getUuid())) {
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

			sb.append(_SQL_SELECT_EDUCATIONALQUALIFICATION_WHERE);

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
				sb.append(EducationalQualificationModelImpl.ORDER_BY_JPQL);
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

				list = (List<EducationalQualification>)QueryUtil.list(
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
	 * Returns the first educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification findByUuid_First(
			String uuid,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException {

		EducationalQualification educationalQualification = fetchByUuid_First(
			uuid, orderByComparator);

		if (educationalQualification != null) {
			return educationalQualification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEducationalQualificationException(sb.toString());
	}

	/**
	 * Returns the first educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification fetchByUuid_First(
		String uuid,
		OrderByComparator<EducationalQualification> orderByComparator) {

		List<EducationalQualification> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification findByUuid_Last(
			String uuid,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException {

		EducationalQualification educationalQualification = fetchByUuid_Last(
			uuid, orderByComparator);

		if (educationalQualification != null) {
			return educationalQualification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEducationalQualificationException(sb.toString());
	}

	/**
	 * Returns the last educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification fetchByUuid_Last(
		String uuid,
		OrderByComparator<EducationalQualification> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<EducationalQualification> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the educational qualifications before and after the current educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param educationalDetailId the primary key of the current educational qualification
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next educational qualification
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	@Override
	public EducationalQualification[] findByUuid_PrevAndNext(
			long educationalDetailId, String uuid,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException {

		uuid = Objects.toString(uuid, "");

		EducationalQualification educationalQualification = findByPrimaryKey(
			educationalDetailId);

		Session session = null;

		try {
			session = openSession();

			EducationalQualification[] array =
				new EducationalQualificationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, educationalQualification, uuid, orderByComparator,
				true);

			array[1] = educationalQualification;

			array[2] = getByUuid_PrevAndNext(
				session, educationalQualification, uuid, orderByComparator,
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

	protected EducationalQualification getByUuid_PrevAndNext(
		Session session, EducationalQualification educationalQualification,
		String uuid,
		OrderByComparator<EducationalQualification> orderByComparator,
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

		sb.append(_SQL_SELECT_EDUCATIONALQUALIFICATION_WHERE);

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
			sb.append(EducationalQualificationModelImpl.ORDER_BY_JPQL);
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
						educationalQualification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EducationalQualification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the educational qualifications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (EducationalQualification educationalQualification :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(educationalQualification);
		}
	}

	/**
	 * Returns the number of educational qualifications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching educational qualifications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EDUCATIONALQUALIFICATION_WHERE);

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
		"educationalQualification.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(educationalQualification.uuid IS NULL OR educationalQualification.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the educational qualification where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEducationalQualificationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification findByUUID_G(String uuid, long groupId)
		throws NoSuchEducationalQualificationException {

		EducationalQualification educationalQualification = fetchByUUID_G(
			uuid, groupId);

		if (educationalQualification == null) {
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

			throw new NoSuchEducationalQualificationException(sb.toString());
		}

		return educationalQualification;
	}

	/**
	 * Returns the educational qualification where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the educational qualification where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification fetchByUUID_G(
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

		if (result instanceof EducationalQualification) {
			EducationalQualification educationalQualification =
				(EducationalQualification)result;

			if (!Objects.equals(uuid, educationalQualification.getUuid()) ||
				(groupId != educationalQualification.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EDUCATIONALQUALIFICATION_WHERE);

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

				List<EducationalQualification> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					EducationalQualification educationalQualification =
						list.get(0);

					result = educationalQualification;

					cacheResult(educationalQualification);
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
			return (EducationalQualification)result;
		}
	}

	/**
	 * Removes the educational qualification where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the educational qualification that was removed
	 */
	@Override
	public EducationalQualification removeByUUID_G(String uuid, long groupId)
		throws NoSuchEducationalQualificationException {

		EducationalQualification educationalQualification = findByUUID_G(
			uuid, groupId);

		return remove(educationalQualification);
	}

	/**
	 * Returns the number of educational qualifications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching educational qualifications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDUCATIONALQUALIFICATION_WHERE);

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
		"educationalQualification.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(educationalQualification.uuid IS NULL OR educationalQualification.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"educationalQualification.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the educational qualifications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching educational qualifications
	 */
	@Override
	public List<EducationalQualification> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<EducationalQualification> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

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
	@Override
	public List<EducationalQualification> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<EducationalQualification> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator,
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

		List<EducationalQualification> list = null;

		if (useFinderCache) {
			list = (List<EducationalQualification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EducationalQualification educationalQualification : list) {
					if (!uuid.equals(educationalQualification.getUuid()) ||
						(companyId !=
							educationalQualification.getCompanyId())) {

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

			sb.append(_SQL_SELECT_EDUCATIONALQUALIFICATION_WHERE);

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
				sb.append(EducationalQualificationModelImpl.ORDER_BY_JPQL);
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

				list = (List<EducationalQualification>)QueryUtil.list(
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
	 * Returns the first educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException {

		EducationalQualification educationalQualification = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (educationalQualification != null) {
			return educationalQualification;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEducationalQualificationException(sb.toString());
	}

	/**
	 * Returns the first educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EducationalQualification> orderByComparator) {

		List<EducationalQualification> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException {

		EducationalQualification educationalQualification = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (educationalQualification != null) {
			return educationalQualification;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEducationalQualificationException(sb.toString());
	}

	/**
	 * Returns the last educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EducationalQualification> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<EducationalQualification> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public EducationalQualification[] findByUuid_C_PrevAndNext(
			long educationalDetailId, String uuid, long companyId,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException {

		uuid = Objects.toString(uuid, "");

		EducationalQualification educationalQualification = findByPrimaryKey(
			educationalDetailId);

		Session session = null;

		try {
			session = openSession();

			EducationalQualification[] array =
				new EducationalQualificationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, educationalQualification, uuid, companyId,
				orderByComparator, true);

			array[1] = educationalQualification;

			array[2] = getByUuid_C_PrevAndNext(
				session, educationalQualification, uuid, companyId,
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

	protected EducationalQualification getByUuid_C_PrevAndNext(
		Session session, EducationalQualification educationalQualification,
		String uuid, long companyId,
		OrderByComparator<EducationalQualification> orderByComparator,
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

		sb.append(_SQL_SELECT_EDUCATIONALQUALIFICATION_WHERE);

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
			sb.append(EducationalQualificationModelImpl.ORDER_BY_JPQL);
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
						educationalQualification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EducationalQualification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the educational qualifications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (EducationalQualification educationalQualification :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(educationalQualification);
		}
	}

	/**
	 * Returns the number of educational qualifications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching educational qualifications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDUCATIONALQUALIFICATION_WHERE);

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
		"educationalQualification.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(educationalQualification.uuid IS NULL OR educationalQualification.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"educationalQualification.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetOsiById;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns all the educational qualifications where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching educational qualifications
	 */
	@Override
	public List<EducationalQualification> findBygetOsiById(
		long osiApplicationId) {

		return findBygetOsiById(
			osiApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<EducationalQualification> findBygetOsiById(
		long osiApplicationId, int start, int end) {

		return findBygetOsiById(osiApplicationId, start, end, null);
	}

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
	@Override
	public List<EducationalQualification> findBygetOsiById(
		long osiApplicationId, int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return findBygetOsiById(
			osiApplicationId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<EducationalQualification> findBygetOsiById(
		long osiApplicationId, int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiById;
				finderArgs = new Object[] {osiApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiById;
			finderArgs = new Object[] {
				osiApplicationId, start, end, orderByComparator
			};
		}

		List<EducationalQualification> list = null;

		if (useFinderCache) {
			list = (List<EducationalQualification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EducationalQualification educationalQualification : list) {
					if (osiApplicationId !=
							educationalQualification.getOsiApplicationId()) {

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

			sb.append(_SQL_SELECT_EDUCATIONALQUALIFICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EducationalQualificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

				list = (List<EducationalQualification>)QueryUtil.list(
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
	 * Returns the first educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification findBygetOsiById_First(
			long osiApplicationId,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException {

		EducationalQualification educationalQualification =
			fetchBygetOsiById_First(osiApplicationId, orderByComparator);

		if (educationalQualification != null) {
			return educationalQualification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiApplicationId=");
		sb.append(osiApplicationId);

		sb.append("}");

		throw new NoSuchEducationalQualificationException(sb.toString());
	}

	/**
	 * Returns the first educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification fetchBygetOsiById_First(
		long osiApplicationId,
		OrderByComparator<EducationalQualification> orderByComparator) {

		List<EducationalQualification> list = findBygetOsiById(
			osiApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification findBygetOsiById_Last(
			long osiApplicationId,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException {

		EducationalQualification educationalQualification =
			fetchBygetOsiById_Last(osiApplicationId, orderByComparator);

		if (educationalQualification != null) {
			return educationalQualification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiApplicationId=");
		sb.append(osiApplicationId);

		sb.append("}");

		throw new NoSuchEducationalQualificationException(sb.toString());
	}

	/**
	 * Returns the last educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	@Override
	public EducationalQualification fetchBygetOsiById_Last(
		long osiApplicationId,
		OrderByComparator<EducationalQualification> orderByComparator) {

		int count = countBygetOsiById(osiApplicationId);

		if (count == 0) {
			return null;
		}

		List<EducationalQualification> list = findBygetOsiById(
			osiApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the educational qualifications before and after the current educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param educationalDetailId the primary key of the current educational qualification
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next educational qualification
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	@Override
	public EducationalQualification[] findBygetOsiById_PrevAndNext(
			long educationalDetailId, long osiApplicationId,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws NoSuchEducationalQualificationException {

		EducationalQualification educationalQualification = findByPrimaryKey(
			educationalDetailId);

		Session session = null;

		try {
			session = openSession();

			EducationalQualification[] array =
				new EducationalQualificationImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, educationalQualification, osiApplicationId,
				orderByComparator, true);

			array[1] = educationalQualification;

			array[2] = getBygetOsiById_PrevAndNext(
				session, educationalQualification, osiApplicationId,
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

	protected EducationalQualification getBygetOsiById_PrevAndNext(
		Session session, EducationalQualification educationalQualification,
		long osiApplicationId,
		OrderByComparator<EducationalQualification> orderByComparator,
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

		sb.append(_SQL_SELECT_EDUCATIONALQUALIFICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

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
			sb.append(EducationalQualificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						educationalQualification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EducationalQualification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the educational qualifications where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 */
	@Override
	public void removeBygetOsiById(long osiApplicationId) {
		for (EducationalQualification educationalQualification :
				findBygetOsiById(
					osiApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(educationalQualification);
		}
	}

	/**
	 * Returns the number of educational qualifications where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching educational qualifications
	 */
	@Override
	public int countBygetOsiById(long osiApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EDUCATIONALQUALIFICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2 =
		"educationalQualification.osiApplicationId = ?";

	public EducationalQualificationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(EducationalQualification.class);

		setModelImplClass(EducationalQualificationImpl.class);
		setModelPKClass(long.class);

		setTable(EducationalQualificationTable.INSTANCE);
	}

	/**
	 * Caches the educational qualification in the entity cache if it is enabled.
	 *
	 * @param educationalQualification the educational qualification
	 */
	@Override
	public void cacheResult(EducationalQualification educationalQualification) {
		entityCache.putResult(
			EducationalQualificationImpl.class,
			educationalQualification.getPrimaryKey(), educationalQualification);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				educationalQualification.getUuid(),
				educationalQualification.getGroupId()
			},
			educationalQualification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the educational qualifications in the entity cache if it is enabled.
	 *
	 * @param educationalQualifications the educational qualifications
	 */
	@Override
	public void cacheResult(
		List<EducationalQualification> educationalQualifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (educationalQualifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (EducationalQualification educationalQualification :
				educationalQualifications) {

			if (entityCache.getResult(
					EducationalQualificationImpl.class,
					educationalQualification.getPrimaryKey()) == null) {

				cacheResult(educationalQualification);
			}
		}
	}

	/**
	 * Clears the cache for all educational qualifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EducationalQualificationImpl.class);

		finderCache.clearCache(EducationalQualificationImpl.class);
	}

	/**
	 * Clears the cache for the educational qualification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EducationalQualification educationalQualification) {
		entityCache.removeResult(
			EducationalQualificationImpl.class, educationalQualification);
	}

	@Override
	public void clearCache(
		List<EducationalQualification> educationalQualifications) {

		for (EducationalQualification educationalQualification :
				educationalQualifications) {

			entityCache.removeResult(
				EducationalQualificationImpl.class, educationalQualification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(EducationalQualificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				EducationalQualificationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		EducationalQualificationModelImpl educationalQualificationModelImpl) {

		Object[] args = new Object[] {
			educationalQualificationModelImpl.getUuid(),
			educationalQualificationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, educationalQualificationModelImpl);
	}

	/**
	 * Creates a new educational qualification with the primary key. Does not add the educational qualification to the database.
	 *
	 * @param educationalDetailId the primary key for the new educational qualification
	 * @return the new educational qualification
	 */
	@Override
	public EducationalQualification create(long educationalDetailId) {
		EducationalQualification educationalQualification =
			new EducationalQualificationImpl();

		educationalQualification.setNew(true);
		educationalQualification.setPrimaryKey(educationalDetailId);

		String uuid = PortalUUIDUtil.generate();

		educationalQualification.setUuid(uuid);

		educationalQualification.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return educationalQualification;
	}

	/**
	 * Removes the educational qualification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param educationalDetailId the primary key of the educational qualification
	 * @return the educational qualification that was removed
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	@Override
	public EducationalQualification remove(long educationalDetailId)
		throws NoSuchEducationalQualificationException {

		return remove((Serializable)educationalDetailId);
	}

	/**
	 * Removes the educational qualification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the educational qualification
	 * @return the educational qualification that was removed
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	@Override
	public EducationalQualification remove(Serializable primaryKey)
		throws NoSuchEducationalQualificationException {

		Session session = null;

		try {
			session = openSession();

			EducationalQualification educationalQualification =
				(EducationalQualification)session.get(
					EducationalQualificationImpl.class, primaryKey);

			if (educationalQualification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEducationalQualificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(educationalQualification);
		}
		catch (NoSuchEducationalQualificationException noSuchEntityException) {
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
	protected EducationalQualification removeImpl(
		EducationalQualification educationalQualification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(educationalQualification)) {
				educationalQualification =
					(EducationalQualification)session.get(
						EducationalQualificationImpl.class,
						educationalQualification.getPrimaryKeyObj());
			}

			if (educationalQualification != null) {
				session.delete(educationalQualification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (educationalQualification != null) {
			clearCache(educationalQualification);
		}

		return educationalQualification;
	}

	@Override
	public EducationalQualification updateImpl(
		EducationalQualification educationalQualification) {

		boolean isNew = educationalQualification.isNew();

		if (!(educationalQualification instanceof
				EducationalQualificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(educationalQualification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					educationalQualification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in educationalQualification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EducationalQualification implementation " +
					educationalQualification.getClass());
		}

		EducationalQualificationModelImpl educationalQualificationModelImpl =
			(EducationalQualificationModelImpl)educationalQualification;

		if (Validator.isNull(educationalQualification.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			educationalQualification.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (educationalQualification.getCreateDate() == null)) {
			if (serviceContext == null) {
				educationalQualification.setCreateDate(date);
			}
			else {
				educationalQualification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!educationalQualificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				educationalQualification.setModifiedDate(date);
			}
			else {
				educationalQualification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(educationalQualification);
			}
			else {
				educationalQualification =
					(EducationalQualification)session.merge(
						educationalQualification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			EducationalQualificationImpl.class,
			educationalQualificationModelImpl, false, true);

		cacheUniqueFindersCache(educationalQualificationModelImpl);

		if (isNew) {
			educationalQualification.setNew(false);
		}

		educationalQualification.resetOriginalValues();

		return educationalQualification;
	}

	/**
	 * Returns the educational qualification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the educational qualification
	 * @return the educational qualification
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	@Override
	public EducationalQualification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEducationalQualificationException {

		EducationalQualification educationalQualification = fetchByPrimaryKey(
			primaryKey);

		if (educationalQualification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEducationalQualificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return educationalQualification;
	}

	/**
	 * Returns the educational qualification with the primary key or throws a <code>NoSuchEducationalQualificationException</code> if it could not be found.
	 *
	 * @param educationalDetailId the primary key of the educational qualification
	 * @return the educational qualification
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	@Override
	public EducationalQualification findByPrimaryKey(long educationalDetailId)
		throws NoSuchEducationalQualificationException {

		return findByPrimaryKey((Serializable)educationalDetailId);
	}

	/**
	 * Returns the educational qualification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param educationalDetailId the primary key of the educational qualification
	 * @return the educational qualification, or <code>null</code> if a educational qualification with the primary key could not be found
	 */
	@Override
	public EducationalQualification fetchByPrimaryKey(
		long educationalDetailId) {

		return fetchByPrimaryKey((Serializable)educationalDetailId);
	}

	/**
	 * Returns all the educational qualifications.
	 *
	 * @return the educational qualifications
	 */
	@Override
	public List<EducationalQualification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<EducationalQualification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<EducationalQualification> findAll(
		int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<EducationalQualification> findAll(
		int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator,
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

		List<EducationalQualification> list = null;

		if (useFinderCache) {
			list = (List<EducationalQualification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EDUCATIONALQUALIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EDUCATIONALQUALIFICATION;

				sql = sql.concat(
					EducationalQualificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<EducationalQualification>)QueryUtil.list(
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
	 * Removes all the educational qualifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EducationalQualification educationalQualification : findAll()) {
			remove(educationalQualification);
		}
	}

	/**
	 * Returns the number of educational qualifications.
	 *
	 * @return the number of educational qualifications
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
					_SQL_COUNT_EDUCATIONALQUALIFICATION);

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
		return "educationalDetailId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EDUCATIONALQUALIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EducationalQualificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the educational qualification persistence.
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

		_finderPathWithPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, false);

		EducationalQualificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		EducationalQualificationUtil.setPersistence(null);

		entityCache.removeCache(EducationalQualificationImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_EDUCATIONALQUALIFICATION =
		"SELECT educationalQualification FROM EducationalQualification educationalQualification";

	private static final String _SQL_SELECT_EDUCATIONALQUALIFICATION_WHERE =
		"SELECT educationalQualification FROM EducationalQualification educationalQualification WHERE ";

	private static final String _SQL_COUNT_EDUCATIONALQUALIFICATION =
		"SELECT COUNT(educationalQualification) FROM EducationalQualification educationalQualification";

	private static final String _SQL_COUNT_EDUCATIONALQUALIFICATION_WHERE =
		"SELECT COUNT(educationalQualification) FROM EducationalQualification educationalQualification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"educationalQualification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EducationalQualification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No EducationalQualification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EducationalQualificationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}