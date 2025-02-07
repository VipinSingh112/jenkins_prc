/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchAddMedicalPractitionerException;
import com.nbp.hsra.application.service.model.AddMedicalPractitioner;
import com.nbp.hsra.application.service.model.AddMedicalPractitionerTable;
import com.nbp.hsra.application.service.model.impl.AddMedicalPractitionerImpl;
import com.nbp.hsra.application.service.model.impl.AddMedicalPractitionerModelImpl;
import com.nbp.hsra.application.service.service.persistence.AddMedicalPractitionerPersistence;
import com.nbp.hsra.application.service.service.persistence.AddMedicalPractitionerUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the add medical practitioner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddMedicalPractitionerPersistence.class)
public class AddMedicalPractitionerPersistenceImpl
	extends BasePersistenceImpl<AddMedicalPractitioner>
	implements AddMedicalPractitionerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddMedicalPractitionerUtil</code> to access the add medical practitioner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddMedicalPractitionerImpl.class.getName();

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
	 * Returns all the add medical practitioners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add medical practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of matching add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator,
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

		List<AddMedicalPractitioner> list = null;

		if (useFinderCache) {
			list = (List<AddMedicalPractitioner>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddMedicalPractitioner addMedicalPractitioner : list) {
					if (!uuid.equals(addMedicalPractitioner.getUuid())) {
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

			sb.append(_SQL_SELECT_ADDMEDICALPRACTITIONER_WHERE);

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
				sb.append(AddMedicalPractitionerModelImpl.ORDER_BY_JPQL);
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

				list = (List<AddMedicalPractitioner>)QueryUtil.list(
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
	 * Returns the first add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner findByUuid_First(
			String uuid,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException {

		AddMedicalPractitioner addMedicalPractitioner = fetchByUuid_First(
			uuid, orderByComparator);

		if (addMedicalPractitioner != null) {
			return addMedicalPractitioner;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAddMedicalPractitionerException(sb.toString());
	}

	/**
	 * Returns the first add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner fetchByUuid_First(
		String uuid,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		List<AddMedicalPractitioner> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner findByUuid_Last(
			String uuid,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException {

		AddMedicalPractitioner addMedicalPractitioner = fetchByUuid_Last(
			uuid, orderByComparator);

		if (addMedicalPractitioner != null) {
			return addMedicalPractitioner;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAddMedicalPractitionerException(sb.toString());
	}

	/**
	 * Returns the last add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner fetchByUuid_Last(
		String uuid,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AddMedicalPractitioner> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add medical practitioners before and after the current add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param addMedicalPractitionerId the primary key of the current add medical practitioner
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	@Override
	public AddMedicalPractitioner[] findByUuid_PrevAndNext(
			long addMedicalPractitionerId, String uuid,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException {

		uuid = Objects.toString(uuid, "");

		AddMedicalPractitioner addMedicalPractitioner = findByPrimaryKey(
			addMedicalPractitionerId);

		Session session = null;

		try {
			session = openSession();

			AddMedicalPractitioner[] array = new AddMedicalPractitionerImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, addMedicalPractitioner, uuid, orderByComparator, true);

			array[1] = addMedicalPractitioner;

			array[2] = getByUuid_PrevAndNext(
				session, addMedicalPractitioner, uuid, orderByComparator,
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

	protected AddMedicalPractitioner getByUuid_PrevAndNext(
		Session session, AddMedicalPractitioner addMedicalPractitioner,
		String uuid,
		OrderByComparator<AddMedicalPractitioner> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDMEDICALPRACTITIONER_WHERE);

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
			sb.append(AddMedicalPractitionerModelImpl.ORDER_BY_JPQL);
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
						addMedicalPractitioner)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddMedicalPractitioner> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add medical practitioners where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AddMedicalPractitioner addMedicalPractitioner :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(addMedicalPractitioner);
		}
	}

	/**
	 * Returns the number of add medical practitioners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching add medical practitioners
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDMEDICALPRACTITIONER_WHERE);

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
		"addMedicalPractitioner.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(addMedicalPractitioner.uuid IS NULL OR addMedicalPractitioner.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the add medical practitioner where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAddMedicalPractitionerException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner findByUUID_G(String uuid, long groupId)
		throws NoSuchAddMedicalPractitionerException {

		AddMedicalPractitioner addMedicalPractitioner = fetchByUUID_G(
			uuid, groupId);

		if (addMedicalPractitioner == null) {
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

			throw new NoSuchAddMedicalPractitionerException(sb.toString());
		}

		return addMedicalPractitioner;
	}

	/**
	 * Returns the add medical practitioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the add medical practitioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner fetchByUUID_G(
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

		if (result instanceof AddMedicalPractitioner) {
			AddMedicalPractitioner addMedicalPractitioner =
				(AddMedicalPractitioner)result;

			if (!Objects.equals(uuid, addMedicalPractitioner.getUuid()) ||
				(groupId != addMedicalPractitioner.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ADDMEDICALPRACTITIONER_WHERE);

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

				List<AddMedicalPractitioner> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					AddMedicalPractitioner addMedicalPractitioner = list.get(0);

					result = addMedicalPractitioner;

					cacheResult(addMedicalPractitioner);
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
			return (AddMedicalPractitioner)result;
		}
	}

	/**
	 * Removes the add medical practitioner where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the add medical practitioner that was removed
	 */
	@Override
	public AddMedicalPractitioner removeByUUID_G(String uuid, long groupId)
		throws NoSuchAddMedicalPractitionerException {

		AddMedicalPractitioner addMedicalPractitioner = findByUUID_G(
			uuid, groupId);

		return remove(addMedicalPractitioner);
	}

	/**
	 * Returns the number of add medical practitioners where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching add medical practitioners
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ADDMEDICALPRACTITIONER_WHERE);

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
		"addMedicalPractitioner.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(addMedicalPractitioner.uuid IS NULL OR addMedicalPractitioner.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"addMedicalPractitioner.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of matching add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator,
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

		List<AddMedicalPractitioner> list = null;

		if (useFinderCache) {
			list = (List<AddMedicalPractitioner>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddMedicalPractitioner addMedicalPractitioner : list) {
					if (!uuid.equals(addMedicalPractitioner.getUuid()) ||
						(companyId != addMedicalPractitioner.getCompanyId())) {

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

			sb.append(_SQL_SELECT_ADDMEDICALPRACTITIONER_WHERE);

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
				sb.append(AddMedicalPractitionerModelImpl.ORDER_BY_JPQL);
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

				list = (List<AddMedicalPractitioner>)QueryUtil.list(
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
	 * Returns the first add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException {

		AddMedicalPractitioner addMedicalPractitioner = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (addMedicalPractitioner != null) {
			return addMedicalPractitioner;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAddMedicalPractitionerException(sb.toString());
	}

	/**
	 * Returns the first add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		List<AddMedicalPractitioner> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException {

		AddMedicalPractitioner addMedicalPractitioner = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (addMedicalPractitioner != null) {
			return addMedicalPractitioner;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAddMedicalPractitionerException(sb.toString());
	}

	/**
	 * Returns the last add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<AddMedicalPractitioner> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add medical practitioners before and after the current add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param addMedicalPractitionerId the primary key of the current add medical practitioner
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	@Override
	public AddMedicalPractitioner[] findByUuid_C_PrevAndNext(
			long addMedicalPractitionerId, String uuid, long companyId,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException {

		uuid = Objects.toString(uuid, "");

		AddMedicalPractitioner addMedicalPractitioner = findByPrimaryKey(
			addMedicalPractitionerId);

		Session session = null;

		try {
			session = openSession();

			AddMedicalPractitioner[] array = new AddMedicalPractitionerImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, addMedicalPractitioner, uuid, companyId,
				orderByComparator, true);

			array[1] = addMedicalPractitioner;

			array[2] = getByUuid_C_PrevAndNext(
				session, addMedicalPractitioner, uuid, companyId,
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

	protected AddMedicalPractitioner getByUuid_C_PrevAndNext(
		Session session, AddMedicalPractitioner addMedicalPractitioner,
		String uuid, long companyId,
		OrderByComparator<AddMedicalPractitioner> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDMEDICALPRACTITIONER_WHERE);

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
			sb.append(AddMedicalPractitionerModelImpl.ORDER_BY_JPQL);
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
						addMedicalPractitioner)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddMedicalPractitioner> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add medical practitioners where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (AddMedicalPractitioner addMedicalPractitioner :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addMedicalPractitioner);
		}
	}

	/**
	 * Returns the number of add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching add medical practitioners
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ADDMEDICALPRACTITIONER_WHERE);

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
		"addMedicalPractitioner.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(addMedicalPractitioner.uuid IS NULL OR addMedicalPractitioner.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"addMedicalPractitioner.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetHsraById;
	private FinderPath _finderPathWithoutPaginationFindBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns all the add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findBygetHsraById(
		long hsraApplicationId) {

		return findBygetHsraById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of matching add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHsraById;
				finderArgs = new Object[] {hsraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsraById;
			finderArgs = new Object[] {
				hsraApplicationId, start, end, orderByComparator
			};
		}

		List<AddMedicalPractitioner> list = null;

		if (useFinderCache) {
			list = (List<AddMedicalPractitioner>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddMedicalPractitioner addMedicalPractitioner : list) {
					if (hsraApplicationId !=
							addMedicalPractitioner.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDMEDICALPRACTITIONER_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddMedicalPractitionerModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<AddMedicalPractitioner>)QueryUtil.list(
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
	 * Returns the first add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException {

		AddMedicalPractitioner addMedicalPractitioner =
			fetchBygetHsraById_First(hsraApplicationId, orderByComparator);

		if (addMedicalPractitioner != null) {
			return addMedicalPractitioner;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchAddMedicalPractitionerException(sb.toString());
	}

	/**
	 * Returns the first add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		List<AddMedicalPractitioner> list = findBygetHsraById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException {

		AddMedicalPractitioner addMedicalPractitioner = fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);

		if (addMedicalPractitioner != null) {
			return addMedicalPractitioner;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchAddMedicalPractitionerException(sb.toString());
	}

	/**
	 * Returns the last add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	@Override
	public AddMedicalPractitioner fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		int count = countBygetHsraById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddMedicalPractitioner> list = findBygetHsraById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add medical practitioners before and after the current add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param addMedicalPractitionerId the primary key of the current add medical practitioner
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	@Override
	public AddMedicalPractitioner[] findBygetHsraById_PrevAndNext(
			long addMedicalPractitionerId, long hsraApplicationId,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException {

		AddMedicalPractitioner addMedicalPractitioner = findByPrimaryKey(
			addMedicalPractitionerId);

		Session session = null;

		try {
			session = openSession();

			AddMedicalPractitioner[] array = new AddMedicalPractitionerImpl[3];

			array[0] = getBygetHsraById_PrevAndNext(
				session, addMedicalPractitioner, hsraApplicationId,
				orderByComparator, true);

			array[1] = addMedicalPractitioner;

			array[2] = getBygetHsraById_PrevAndNext(
				session, addMedicalPractitioner, hsraApplicationId,
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

	protected AddMedicalPractitioner getBygetHsraById_PrevAndNext(
		Session session, AddMedicalPractitioner addMedicalPractitioner,
		long hsraApplicationId,
		OrderByComparator<AddMedicalPractitioner> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDMEDICALPRACTITIONER_WHERE);

		sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

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
			sb.append(AddMedicalPractitionerModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(hsraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						addMedicalPractitioner)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddMedicalPractitioner> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add medical practitioners where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraById(long hsraApplicationId) {
		for (AddMedicalPractitioner addMedicalPractitioner :
				findBygetHsraById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addMedicalPractitioner);
		}
	}

	/**
	 * Returns the number of add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching add medical practitioners
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDMEDICALPRACTITIONER_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"addMedicalPractitioner.hsraApplicationId = ?";

	public AddMedicalPractitionerPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AddMedicalPractitioner.class);

		setModelImplClass(AddMedicalPractitionerImpl.class);
		setModelPKClass(long.class);

		setTable(AddMedicalPractitionerTable.INSTANCE);
	}

	/**
	 * Caches the add medical practitioner in the entity cache if it is enabled.
	 *
	 * @param addMedicalPractitioner the add medical practitioner
	 */
	@Override
	public void cacheResult(AddMedicalPractitioner addMedicalPractitioner) {
		entityCache.putResult(
			AddMedicalPractitionerImpl.class,
			addMedicalPractitioner.getPrimaryKey(), addMedicalPractitioner);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				addMedicalPractitioner.getUuid(),
				addMedicalPractitioner.getGroupId()
			},
			addMedicalPractitioner);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add medical practitioners in the entity cache if it is enabled.
	 *
	 * @param addMedicalPractitioners the add medical practitioners
	 */
	@Override
	public void cacheResult(
		List<AddMedicalPractitioner> addMedicalPractitioners) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addMedicalPractitioners.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddMedicalPractitioner addMedicalPractitioner :
				addMedicalPractitioners) {

			if (entityCache.getResult(
					AddMedicalPractitionerImpl.class,
					addMedicalPractitioner.getPrimaryKey()) == null) {

				cacheResult(addMedicalPractitioner);
			}
		}
	}

	/**
	 * Clears the cache for all add medical practitioners.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddMedicalPractitionerImpl.class);

		finderCache.clearCache(AddMedicalPractitionerImpl.class);
	}

	/**
	 * Clears the cache for the add medical practitioner.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddMedicalPractitioner addMedicalPractitioner) {
		entityCache.removeResult(
			AddMedicalPractitionerImpl.class, addMedicalPractitioner);
	}

	@Override
	public void clearCache(
		List<AddMedicalPractitioner> addMedicalPractitioners) {

		for (AddMedicalPractitioner addMedicalPractitioner :
				addMedicalPractitioners) {

			entityCache.removeResult(
				AddMedicalPractitionerImpl.class, addMedicalPractitioner);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddMedicalPractitionerImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddMedicalPractitionerImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AddMedicalPractitionerModelImpl addMedicalPractitionerModelImpl) {

		Object[] args = new Object[] {
			addMedicalPractitionerModelImpl.getUuid(),
			addMedicalPractitionerModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, addMedicalPractitionerModelImpl);
	}

	/**
	 * Creates a new add medical practitioner with the primary key. Does not add the add medical practitioner to the database.
	 *
	 * @param addMedicalPractitionerId the primary key for the new add medical practitioner
	 * @return the new add medical practitioner
	 */
	@Override
	public AddMedicalPractitioner create(long addMedicalPractitionerId) {
		AddMedicalPractitioner addMedicalPractitioner =
			new AddMedicalPractitionerImpl();

		addMedicalPractitioner.setNew(true);
		addMedicalPractitioner.setPrimaryKey(addMedicalPractitionerId);

		String uuid = PortalUUIDUtil.generate();

		addMedicalPractitioner.setUuid(uuid);

		addMedicalPractitioner.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addMedicalPractitioner;
	}

	/**
	 * Removes the add medical practitioner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addMedicalPractitionerId the primary key of the add medical practitioner
	 * @return the add medical practitioner that was removed
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	@Override
	public AddMedicalPractitioner remove(long addMedicalPractitionerId)
		throws NoSuchAddMedicalPractitionerException {

		return remove((Serializable)addMedicalPractitionerId);
	}

	/**
	 * Removes the add medical practitioner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add medical practitioner
	 * @return the add medical practitioner that was removed
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	@Override
	public AddMedicalPractitioner remove(Serializable primaryKey)
		throws NoSuchAddMedicalPractitionerException {

		Session session = null;

		try {
			session = openSession();

			AddMedicalPractitioner addMedicalPractitioner =
				(AddMedicalPractitioner)session.get(
					AddMedicalPractitionerImpl.class, primaryKey);

			if (addMedicalPractitioner == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddMedicalPractitionerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addMedicalPractitioner);
		}
		catch (NoSuchAddMedicalPractitionerException noSuchEntityException) {
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
	protected AddMedicalPractitioner removeImpl(
		AddMedicalPractitioner addMedicalPractitioner) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addMedicalPractitioner)) {
				addMedicalPractitioner = (AddMedicalPractitioner)session.get(
					AddMedicalPractitionerImpl.class,
					addMedicalPractitioner.getPrimaryKeyObj());
			}

			if (addMedicalPractitioner != null) {
				session.delete(addMedicalPractitioner);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addMedicalPractitioner != null) {
			clearCache(addMedicalPractitioner);
		}

		return addMedicalPractitioner;
	}

	@Override
	public AddMedicalPractitioner updateImpl(
		AddMedicalPractitioner addMedicalPractitioner) {

		boolean isNew = addMedicalPractitioner.isNew();

		if (!(addMedicalPractitioner instanceof
				AddMedicalPractitionerModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addMedicalPractitioner.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addMedicalPractitioner);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addMedicalPractitioner proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddMedicalPractitioner implementation " +
					addMedicalPractitioner.getClass());
		}

		AddMedicalPractitionerModelImpl addMedicalPractitionerModelImpl =
			(AddMedicalPractitionerModelImpl)addMedicalPractitioner;

		if (Validator.isNull(addMedicalPractitioner.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			addMedicalPractitioner.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addMedicalPractitioner.getCreateDate() == null)) {
			if (serviceContext == null) {
				addMedicalPractitioner.setCreateDate(date);
			}
			else {
				addMedicalPractitioner.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addMedicalPractitionerModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addMedicalPractitioner.setModifiedDate(date);
			}
			else {
				addMedicalPractitioner.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addMedicalPractitioner);
			}
			else {
				addMedicalPractitioner = (AddMedicalPractitioner)session.merge(
					addMedicalPractitioner);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddMedicalPractitionerImpl.class, addMedicalPractitionerModelImpl,
			false, true);

		cacheUniqueFindersCache(addMedicalPractitionerModelImpl);

		if (isNew) {
			addMedicalPractitioner.setNew(false);
		}

		addMedicalPractitioner.resetOriginalValues();

		return addMedicalPractitioner;
	}

	/**
	 * Returns the add medical practitioner with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add medical practitioner
	 * @return the add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	@Override
	public AddMedicalPractitioner findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddMedicalPractitionerException {

		AddMedicalPractitioner addMedicalPractitioner = fetchByPrimaryKey(
			primaryKey);

		if (addMedicalPractitioner == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddMedicalPractitionerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addMedicalPractitioner;
	}

	/**
	 * Returns the add medical practitioner with the primary key or throws a <code>NoSuchAddMedicalPractitionerException</code> if it could not be found.
	 *
	 * @param addMedicalPractitionerId the primary key of the add medical practitioner
	 * @return the add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	@Override
	public AddMedicalPractitioner findByPrimaryKey(
			long addMedicalPractitionerId)
		throws NoSuchAddMedicalPractitionerException {

		return findByPrimaryKey((Serializable)addMedicalPractitionerId);
	}

	/**
	 * Returns the add medical practitioner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addMedicalPractitionerId the primary key of the add medical practitioner
	 * @return the add medical practitioner, or <code>null</code> if a add medical practitioner with the primary key could not be found
	 */
	@Override
	public AddMedicalPractitioner fetchByPrimaryKey(
		long addMedicalPractitionerId) {

		return fetchByPrimaryKey((Serializable)addMedicalPractitionerId);
	}

	/**
	 * Returns all the add medical practitioners.
	 *
	 * @return the add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add medical practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findAll(
		int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add medical practitioners
	 */
	@Override
	public List<AddMedicalPractitioner> findAll(
		int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator,
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

		List<AddMedicalPractitioner> list = null;

		if (useFinderCache) {
			list = (List<AddMedicalPractitioner>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDMEDICALPRACTITIONER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDMEDICALPRACTITIONER;

				sql = sql.concat(AddMedicalPractitionerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddMedicalPractitioner>)QueryUtil.list(
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
	 * Removes all the add medical practitioners from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddMedicalPractitioner addMedicalPractitioner : findAll()) {
			remove(addMedicalPractitioner);
		}
	}

	/**
	 * Returns the number of add medical practitioners.
	 *
	 * @return the number of add medical practitioners
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
					_SQL_COUNT_ADDMEDICALPRACTITIONER);

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
		return "addMedicalPractitionerId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDMEDICALPRACTITIONER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddMedicalPractitionerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add medical practitioner persistence.
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

		_finderPathWithPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsraById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"hsraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		AddMedicalPractitionerUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddMedicalPractitionerUtil.setPersistence(null);

		entityCache.removeCache(AddMedicalPractitionerImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ADDMEDICALPRACTITIONER =
		"SELECT addMedicalPractitioner FROM AddMedicalPractitioner addMedicalPractitioner";

	private static final String _SQL_SELECT_ADDMEDICALPRACTITIONER_WHERE =
		"SELECT addMedicalPractitioner FROM AddMedicalPractitioner addMedicalPractitioner WHERE ";

	private static final String _SQL_COUNT_ADDMEDICALPRACTITIONER =
		"SELECT COUNT(addMedicalPractitioner) FROM AddMedicalPractitioner addMedicalPractitioner";

	private static final String _SQL_COUNT_ADDMEDICALPRACTITIONER_WHERE =
		"SELECT COUNT(addMedicalPractitioner) FROM AddMedicalPractitioner addMedicalPractitioner WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addMedicalPractitioner.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddMedicalPractitioner exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddMedicalPractitioner exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddMedicalPractitionerPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}