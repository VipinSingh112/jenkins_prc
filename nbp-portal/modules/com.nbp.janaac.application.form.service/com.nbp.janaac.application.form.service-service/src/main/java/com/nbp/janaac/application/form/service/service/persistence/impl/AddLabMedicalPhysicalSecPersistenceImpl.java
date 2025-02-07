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

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabMedicalPhysicalSecException;
import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec;
import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSecTable;
import com.nbp.janaac.application.form.service.model.impl.AddLabMedicalPhysicalSecImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLabMedicalPhysicalSecModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalPhysicalSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalPhysicalSecUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the add lab medical physical sec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddLabMedicalPhysicalSecPersistence.class)
public class AddLabMedicalPhysicalSecPersistenceImpl
	extends BasePersistenceImpl<AddLabMedicalPhysicalSec>
	implements AddLabMedicalPhysicalSecPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddLabMedicalPhysicalSecUtil</code> to access the add lab medical physical sec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddLabMedicalPhysicalSecImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJanaacById;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaacById;
	private FinderPath _finderPathCountBygetJanaacById;

	/**
	 * Returns all the add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab medical physical secs
	 */
	@Override
	public List<AddLabMedicalPhysicalSec> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @return the range of matching add lab medical physical secs
	 */
	@Override
	public List<AddLabMedicalPhysicalSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab medical physical secs
	 */
	@Override
	public List<AddLabMedicalPhysicalSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab medical physical secs
	 */
	@Override
	public List<AddLabMedicalPhysicalSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaacById;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaacById;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<AddLabMedicalPhysicalSec> list = null;

		if (useFinderCache) {
			list = (List<AddLabMedicalPhysicalSec>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddLabMedicalPhysicalSec addLabMedicalPhysicalSec : list) {
					if (janaacApplicationId !=
							addLabMedicalPhysicalSec.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDLABMEDICALPHYSICALSEC_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddLabMedicalPhysicalSecModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddLabMedicalPhysicalSec>)QueryUtil.list(
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
	 * Returns the first add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical physical sec
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a matching add lab medical physical sec could not be found
	 */
	@Override
	public AddLabMedicalPhysicalSec findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator)
		throws NoSuchAddLabMedicalPhysicalSecException {

		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addLabMedicalPhysicalSec != null) {
			return addLabMedicalPhysicalSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabMedicalPhysicalSecException(sb.toString());
	}

	/**
	 * Returns the first add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical physical sec, or <code>null</code> if a matching add lab medical physical sec could not be found
	 */
	@Override
	public AddLabMedicalPhysicalSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator) {

		List<AddLabMedicalPhysicalSec> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical physical sec
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a matching add lab medical physical sec could not be found
	 */
	@Override
	public AddLabMedicalPhysicalSec findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator)
		throws NoSuchAddLabMedicalPhysicalSecException {

		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec =
			fetchBygetJanaacById_Last(janaacApplicationId, orderByComparator);

		if (addLabMedicalPhysicalSec != null) {
			return addLabMedicalPhysicalSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabMedicalPhysicalSecException(sb.toString());
	}

	/**
	 * Returns the last add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical physical sec, or <code>null</code> if a matching add lab medical physical sec could not be found
	 */
	@Override
	public AddLabMedicalPhysicalSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddLabMedicalPhysicalSec> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add lab medical physical secs before and after the current add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the current add lab medical physical sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab medical physical sec
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a add lab medical physical sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalPhysicalSec[] findBygetJanaacById_PrevAndNext(
			long addLabMedicalPhysicalSecId, long janaacApplicationId,
			OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator)
		throws NoSuchAddLabMedicalPhysicalSecException {

		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec = findByPrimaryKey(
			addLabMedicalPhysicalSecId);

		Session session = null;

		try {
			session = openSession();

			AddLabMedicalPhysicalSec[] array =
				new AddLabMedicalPhysicalSecImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addLabMedicalPhysicalSec, janaacApplicationId,
				orderByComparator, true);

			array[1] = addLabMedicalPhysicalSec;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addLabMedicalPhysicalSec, janaacApplicationId,
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

	protected AddLabMedicalPhysicalSec getBygetJanaacById_PrevAndNext(
		Session session, AddLabMedicalPhysicalSec addLabMedicalPhysicalSec,
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDLABMEDICALPHYSICALSEC_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

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
			sb.append(AddLabMedicalPhysicalSecModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(janaacApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						addLabMedicalPhysicalSec)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddLabMedicalPhysicalSec> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add lab medical physical secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddLabMedicalPhysicalSec addLabMedicalPhysicalSec :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addLabMedicalPhysicalSec);
		}
	}

	/**
	 * Returns the number of add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab medical physical secs
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDLABMEDICALPHYSICALSEC_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2 =
			"addLabMedicalPhysicalSec.janaacApplicationId = ?";

	public AddLabMedicalPhysicalSecPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("number", "number_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AddLabMedicalPhysicalSec.class);

		setModelImplClass(AddLabMedicalPhysicalSecImpl.class);
		setModelPKClass(long.class);

		setTable(AddLabMedicalPhysicalSecTable.INSTANCE);
	}

	/**
	 * Caches the add lab medical physical sec in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalPhysicalSec the add lab medical physical sec
	 */
	@Override
	public void cacheResult(AddLabMedicalPhysicalSec addLabMedicalPhysicalSec) {
		entityCache.putResult(
			AddLabMedicalPhysicalSecImpl.class,
			addLabMedicalPhysicalSec.getPrimaryKey(), addLabMedicalPhysicalSec);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add lab medical physical secs in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalPhysicalSecs the add lab medical physical secs
	 */
	@Override
	public void cacheResult(
		List<AddLabMedicalPhysicalSec> addLabMedicalPhysicalSecs) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addLabMedicalPhysicalSecs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddLabMedicalPhysicalSec addLabMedicalPhysicalSec :
				addLabMedicalPhysicalSecs) {

			if (entityCache.getResult(
					AddLabMedicalPhysicalSecImpl.class,
					addLabMedicalPhysicalSec.getPrimaryKey()) == null) {

				cacheResult(addLabMedicalPhysicalSec);
			}
		}
	}

	/**
	 * Clears the cache for all add lab medical physical secs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddLabMedicalPhysicalSecImpl.class);

		finderCache.clearCache(AddLabMedicalPhysicalSecImpl.class);
	}

	/**
	 * Clears the cache for the add lab medical physical sec.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddLabMedicalPhysicalSec addLabMedicalPhysicalSec) {
		entityCache.removeResult(
			AddLabMedicalPhysicalSecImpl.class, addLabMedicalPhysicalSec);
	}

	@Override
	public void clearCache(
		List<AddLabMedicalPhysicalSec> addLabMedicalPhysicalSecs) {

		for (AddLabMedicalPhysicalSec addLabMedicalPhysicalSec :
				addLabMedicalPhysicalSecs) {

			entityCache.removeResult(
				AddLabMedicalPhysicalSecImpl.class, addLabMedicalPhysicalSec);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddLabMedicalPhysicalSecImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddLabMedicalPhysicalSecImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add lab medical physical sec with the primary key. Does not add the add lab medical physical sec to the database.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key for the new add lab medical physical sec
	 * @return the new add lab medical physical sec
	 */
	@Override
	public AddLabMedicalPhysicalSec create(long addLabMedicalPhysicalSecId) {
		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec =
			new AddLabMedicalPhysicalSecImpl();

		addLabMedicalPhysicalSec.setNew(true);
		addLabMedicalPhysicalSec.setPrimaryKey(addLabMedicalPhysicalSecId);

		addLabMedicalPhysicalSec.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return addLabMedicalPhysicalSec;
	}

	/**
	 * Removes the add lab medical physical sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the add lab medical physical sec
	 * @return the add lab medical physical sec that was removed
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a add lab medical physical sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalPhysicalSec remove(long addLabMedicalPhysicalSecId)
		throws NoSuchAddLabMedicalPhysicalSecException {

		return remove((Serializable)addLabMedicalPhysicalSecId);
	}

	/**
	 * Removes the add lab medical physical sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add lab medical physical sec
	 * @return the add lab medical physical sec that was removed
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a add lab medical physical sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalPhysicalSec remove(Serializable primaryKey)
		throws NoSuchAddLabMedicalPhysicalSecException {

		Session session = null;

		try {
			session = openSession();

			AddLabMedicalPhysicalSec addLabMedicalPhysicalSec =
				(AddLabMedicalPhysicalSec)session.get(
					AddLabMedicalPhysicalSecImpl.class, primaryKey);

			if (addLabMedicalPhysicalSec == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddLabMedicalPhysicalSecException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addLabMedicalPhysicalSec);
		}
		catch (NoSuchAddLabMedicalPhysicalSecException noSuchEntityException) {
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
	protected AddLabMedicalPhysicalSec removeImpl(
		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addLabMedicalPhysicalSec)) {
				addLabMedicalPhysicalSec =
					(AddLabMedicalPhysicalSec)session.get(
						AddLabMedicalPhysicalSecImpl.class,
						addLabMedicalPhysicalSec.getPrimaryKeyObj());
			}

			if (addLabMedicalPhysicalSec != null) {
				session.delete(addLabMedicalPhysicalSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addLabMedicalPhysicalSec != null) {
			clearCache(addLabMedicalPhysicalSec);
		}

		return addLabMedicalPhysicalSec;
	}

	@Override
	public AddLabMedicalPhysicalSec updateImpl(
		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec) {

		boolean isNew = addLabMedicalPhysicalSec.isNew();

		if (!(addLabMedicalPhysicalSec instanceof
				AddLabMedicalPhysicalSecModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addLabMedicalPhysicalSec.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addLabMedicalPhysicalSec);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addLabMedicalPhysicalSec proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddLabMedicalPhysicalSec implementation " +
					addLabMedicalPhysicalSec.getClass());
		}

		AddLabMedicalPhysicalSecModelImpl addLabMedicalPhysicalSecModelImpl =
			(AddLabMedicalPhysicalSecModelImpl)addLabMedicalPhysicalSec;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addLabMedicalPhysicalSec.getCreateDate() == null)) {
			if (serviceContext == null) {
				addLabMedicalPhysicalSec.setCreateDate(date);
			}
			else {
				addLabMedicalPhysicalSec.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addLabMedicalPhysicalSecModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addLabMedicalPhysicalSec.setModifiedDate(date);
			}
			else {
				addLabMedicalPhysicalSec.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addLabMedicalPhysicalSec);
			}
			else {
				addLabMedicalPhysicalSec =
					(AddLabMedicalPhysicalSec)session.merge(
						addLabMedicalPhysicalSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddLabMedicalPhysicalSecImpl.class,
			addLabMedicalPhysicalSecModelImpl, false, true);

		if (isNew) {
			addLabMedicalPhysicalSec.setNew(false);
		}

		addLabMedicalPhysicalSec.resetOriginalValues();

		return addLabMedicalPhysicalSec;
	}

	/**
	 * Returns the add lab medical physical sec with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add lab medical physical sec
	 * @return the add lab medical physical sec
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a add lab medical physical sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalPhysicalSec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddLabMedicalPhysicalSecException {

		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec = fetchByPrimaryKey(
			primaryKey);

		if (addLabMedicalPhysicalSec == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddLabMedicalPhysicalSecException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addLabMedicalPhysicalSec;
	}

	/**
	 * Returns the add lab medical physical sec with the primary key or throws a <code>NoSuchAddLabMedicalPhysicalSecException</code> if it could not be found.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the add lab medical physical sec
	 * @return the add lab medical physical sec
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a add lab medical physical sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalPhysicalSec findByPrimaryKey(
			long addLabMedicalPhysicalSecId)
		throws NoSuchAddLabMedicalPhysicalSecException {

		return findByPrimaryKey((Serializable)addLabMedicalPhysicalSecId);
	}

	/**
	 * Returns the add lab medical physical sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the add lab medical physical sec
	 * @return the add lab medical physical sec, or <code>null</code> if a add lab medical physical sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalPhysicalSec fetchByPrimaryKey(
		long addLabMedicalPhysicalSecId) {

		return fetchByPrimaryKey((Serializable)addLabMedicalPhysicalSecId);
	}

	/**
	 * Returns all the add lab medical physical secs.
	 *
	 * @return the add lab medical physical secs
	 */
	@Override
	public List<AddLabMedicalPhysicalSec> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab medical physical secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @return the range of add lab medical physical secs
	 */
	@Override
	public List<AddLabMedicalPhysicalSec> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab medical physical secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab medical physical secs
	 */
	@Override
	public List<AddLabMedicalPhysicalSec> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab medical physical secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab medical physical secs
	 */
	@Override
	public List<AddLabMedicalPhysicalSec> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator,
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

		List<AddLabMedicalPhysicalSec> list = null;

		if (useFinderCache) {
			list = (List<AddLabMedicalPhysicalSec>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDLABMEDICALPHYSICALSEC);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDLABMEDICALPHYSICALSEC;

				sql = sql.concat(
					AddLabMedicalPhysicalSecModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddLabMedicalPhysicalSec>)QueryUtil.list(
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
	 * Removes all the add lab medical physical secs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddLabMedicalPhysicalSec addLabMedicalPhysicalSec : findAll()) {
			remove(addLabMedicalPhysicalSec);
		}
	}

	/**
	 * Returns the number of add lab medical physical secs.
	 *
	 * @return the number of add lab medical physical secs
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
					_SQL_COUNT_ADDLABMEDICALPHYSICALSEC);

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
		return "addLabMedicalPhysicalSecId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDLABMEDICALPHYSICALSEC;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddLabMedicalPhysicalSecModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add lab medical physical sec persistence.
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

		_finderPathWithPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaacById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AddLabMedicalPhysicalSecUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddLabMedicalPhysicalSecUtil.setPersistence(null);

		entityCache.removeCache(AddLabMedicalPhysicalSecImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDLABMEDICALPHYSICALSEC =
		"SELECT addLabMedicalPhysicalSec FROM AddLabMedicalPhysicalSec addLabMedicalPhysicalSec";

	private static final String _SQL_SELECT_ADDLABMEDICALPHYSICALSEC_WHERE =
		"SELECT addLabMedicalPhysicalSec FROM AddLabMedicalPhysicalSec addLabMedicalPhysicalSec WHERE ";

	private static final String _SQL_COUNT_ADDLABMEDICALPHYSICALSEC =
		"SELECT COUNT(addLabMedicalPhysicalSec) FROM AddLabMedicalPhysicalSec addLabMedicalPhysicalSec";

	private static final String _SQL_COUNT_ADDLABMEDICALPHYSICALSEC_WHERE =
		"SELECT COUNT(addLabMedicalPhysicalSec) FROM AddLabMedicalPhysicalSec addLabMedicalPhysicalSec WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addLabMedicalPhysicalSec.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddLabMedicalPhysicalSec exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddLabMedicalPhysicalSec exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddLabMedicalPhysicalSecPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"number"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}