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

import com.nbp.janaac.application.form.service.exception.NoSuchAddInsOrgInfoThirdException;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoThirdTable;
import com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoThirdImpl;
import com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoThirdModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddInsOrgInfoThirdPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddInsOrgInfoThirdUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the add ins org info third service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddInsOrgInfoThirdPersistence.class)
public class AddInsOrgInfoThirdPersistenceImpl
	extends BasePersistenceImpl<AddInsOrgInfoThird>
	implements AddInsOrgInfoThirdPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddInsOrgInfoThirdUtil</code> to access the add ins org info third persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddInsOrgInfoThirdImpl.class.getName();

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
	 * Returns all the add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add ins org info thirds
	 */
	@Override
	public List<AddInsOrgInfoThird> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @return the range of matching add ins org info thirds
	 */
	@Override
	public List<AddInsOrgInfoThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add ins org info thirds
	 */
	@Override
	public List<AddInsOrgInfoThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add ins org info thirds
	 */
	@Override
	public List<AddInsOrgInfoThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator,
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

		List<AddInsOrgInfoThird> list = null;

		if (useFinderCache) {
			list = (List<AddInsOrgInfoThird>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddInsOrgInfoThird addInsOrgInfoThird : list) {
					if (janaacApplicationId !=
							addInsOrgInfoThird.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDINSORGINFOTHIRD_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddInsOrgInfoThirdModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddInsOrgInfoThird>)QueryUtil.list(
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
	 * Returns the first add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info third
	 * @throws NoSuchAddInsOrgInfoThirdException if a matching add ins org info third could not be found
	 */
	@Override
	public AddInsOrgInfoThird findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoThird> orderByComparator)
		throws NoSuchAddInsOrgInfoThirdException {

		AddInsOrgInfoThird addInsOrgInfoThird = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addInsOrgInfoThird != null) {
			return addInsOrgInfoThird;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddInsOrgInfoThirdException(sb.toString());
	}

	/**
	 * Returns the first add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info third, or <code>null</code> if a matching add ins org info third could not be found
	 */
	@Override
	public AddInsOrgInfoThird fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator) {

		List<AddInsOrgInfoThird> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info third
	 * @throws NoSuchAddInsOrgInfoThirdException if a matching add ins org info third could not be found
	 */
	@Override
	public AddInsOrgInfoThird findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoThird> orderByComparator)
		throws NoSuchAddInsOrgInfoThirdException {

		AddInsOrgInfoThird addInsOrgInfoThird = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addInsOrgInfoThird != null) {
			return addInsOrgInfoThird;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddInsOrgInfoThirdException(sb.toString());
	}

	/**
	 * Returns the last add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info third, or <code>null</code> if a matching add ins org info third could not be found
	 */
	@Override
	public AddInsOrgInfoThird fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddInsOrgInfoThird> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add ins org info thirds before and after the current add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the current add ins org info third
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add ins org info third
	 * @throws NoSuchAddInsOrgInfoThirdException if a add ins org info third with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoThird[] findBygetJanaacById_PrevAndNext(
			long AddInsOrgInfoThirdId, long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoThird> orderByComparator)
		throws NoSuchAddInsOrgInfoThirdException {

		AddInsOrgInfoThird addInsOrgInfoThird = findByPrimaryKey(
			AddInsOrgInfoThirdId);

		Session session = null;

		try {
			session = openSession();

			AddInsOrgInfoThird[] array = new AddInsOrgInfoThirdImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addInsOrgInfoThird, janaacApplicationId,
				orderByComparator, true);

			array[1] = addInsOrgInfoThird;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addInsOrgInfoThird, janaacApplicationId,
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

	protected AddInsOrgInfoThird getBygetJanaacById_PrevAndNext(
		Session session, AddInsOrgInfoThird addInsOrgInfoThird,
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDINSORGINFOTHIRD_WHERE);

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
			sb.append(AddInsOrgInfoThirdModelImpl.ORDER_BY_JPQL);
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
						addInsOrgInfoThird)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddInsOrgInfoThird> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add ins org info thirds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddInsOrgInfoThird addInsOrgInfoThird :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addInsOrgInfoThird);
		}
	}

	/**
	 * Returns the number of add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add ins org info thirds
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDINSORGINFOTHIRD_WHERE);

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
			"addInsOrgInfoThird.janaacApplicationId = ?";

	public AddInsOrgInfoThirdPersistenceImpl() {
		setModelClass(AddInsOrgInfoThird.class);

		setModelImplClass(AddInsOrgInfoThirdImpl.class);
		setModelPKClass(long.class);

		setTable(AddInsOrgInfoThirdTable.INSTANCE);
	}

	/**
	 * Caches the add ins org info third in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoThird the add ins org info third
	 */
	@Override
	public void cacheResult(AddInsOrgInfoThird addInsOrgInfoThird) {
		entityCache.putResult(
			AddInsOrgInfoThirdImpl.class, addInsOrgInfoThird.getPrimaryKey(),
			addInsOrgInfoThird);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add ins org info thirds in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoThirds the add ins org info thirds
	 */
	@Override
	public void cacheResult(List<AddInsOrgInfoThird> addInsOrgInfoThirds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addInsOrgInfoThirds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddInsOrgInfoThird addInsOrgInfoThird : addInsOrgInfoThirds) {
			if (entityCache.getResult(
					AddInsOrgInfoThirdImpl.class,
					addInsOrgInfoThird.getPrimaryKey()) == null) {

				cacheResult(addInsOrgInfoThird);
			}
		}
	}

	/**
	 * Clears the cache for all add ins org info thirds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddInsOrgInfoThirdImpl.class);

		finderCache.clearCache(AddInsOrgInfoThirdImpl.class);
	}

	/**
	 * Clears the cache for the add ins org info third.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddInsOrgInfoThird addInsOrgInfoThird) {
		entityCache.removeResult(
			AddInsOrgInfoThirdImpl.class, addInsOrgInfoThird);
	}

	@Override
	public void clearCache(List<AddInsOrgInfoThird> addInsOrgInfoThirds) {
		for (AddInsOrgInfoThird addInsOrgInfoThird : addInsOrgInfoThirds) {
			entityCache.removeResult(
				AddInsOrgInfoThirdImpl.class, addInsOrgInfoThird);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddInsOrgInfoThirdImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AddInsOrgInfoThirdImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add ins org info third with the primary key. Does not add the add ins org info third to the database.
	 *
	 * @param AddInsOrgInfoThirdId the primary key for the new add ins org info third
	 * @return the new add ins org info third
	 */
	@Override
	public AddInsOrgInfoThird create(long AddInsOrgInfoThirdId) {
		AddInsOrgInfoThird addInsOrgInfoThird = new AddInsOrgInfoThirdImpl();

		addInsOrgInfoThird.setNew(true);
		addInsOrgInfoThird.setPrimaryKey(AddInsOrgInfoThirdId);

		addInsOrgInfoThird.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addInsOrgInfoThird;
	}

	/**
	 * Removes the add ins org info third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the add ins org info third
	 * @return the add ins org info third that was removed
	 * @throws NoSuchAddInsOrgInfoThirdException if a add ins org info third with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoThird remove(long AddInsOrgInfoThirdId)
		throws NoSuchAddInsOrgInfoThirdException {

		return remove((Serializable)AddInsOrgInfoThirdId);
	}

	/**
	 * Removes the add ins org info third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add ins org info third
	 * @return the add ins org info third that was removed
	 * @throws NoSuchAddInsOrgInfoThirdException if a add ins org info third with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoThird remove(Serializable primaryKey)
		throws NoSuchAddInsOrgInfoThirdException {

		Session session = null;

		try {
			session = openSession();

			AddInsOrgInfoThird addInsOrgInfoThird =
				(AddInsOrgInfoThird)session.get(
					AddInsOrgInfoThirdImpl.class, primaryKey);

			if (addInsOrgInfoThird == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddInsOrgInfoThirdException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addInsOrgInfoThird);
		}
		catch (NoSuchAddInsOrgInfoThirdException noSuchEntityException) {
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
	protected AddInsOrgInfoThird removeImpl(
		AddInsOrgInfoThird addInsOrgInfoThird) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addInsOrgInfoThird)) {
				addInsOrgInfoThird = (AddInsOrgInfoThird)session.get(
					AddInsOrgInfoThirdImpl.class,
					addInsOrgInfoThird.getPrimaryKeyObj());
			}

			if (addInsOrgInfoThird != null) {
				session.delete(addInsOrgInfoThird);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addInsOrgInfoThird != null) {
			clearCache(addInsOrgInfoThird);
		}

		return addInsOrgInfoThird;
	}

	@Override
	public AddInsOrgInfoThird updateImpl(
		AddInsOrgInfoThird addInsOrgInfoThird) {

		boolean isNew = addInsOrgInfoThird.isNew();

		if (!(addInsOrgInfoThird instanceof AddInsOrgInfoThirdModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addInsOrgInfoThird.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addInsOrgInfoThird);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addInsOrgInfoThird proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddInsOrgInfoThird implementation " +
					addInsOrgInfoThird.getClass());
		}

		AddInsOrgInfoThirdModelImpl addInsOrgInfoThirdModelImpl =
			(AddInsOrgInfoThirdModelImpl)addInsOrgInfoThird;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addInsOrgInfoThird.getCreateDate() == null)) {
			if (serviceContext == null) {
				addInsOrgInfoThird.setCreateDate(date);
			}
			else {
				addInsOrgInfoThird.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addInsOrgInfoThirdModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addInsOrgInfoThird.setModifiedDate(date);
			}
			else {
				addInsOrgInfoThird.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addInsOrgInfoThird);
			}
			else {
				addInsOrgInfoThird = (AddInsOrgInfoThird)session.merge(
					addInsOrgInfoThird);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddInsOrgInfoThirdImpl.class, addInsOrgInfoThirdModelImpl, false,
			true);

		if (isNew) {
			addInsOrgInfoThird.setNew(false);
		}

		addInsOrgInfoThird.resetOriginalValues();

		return addInsOrgInfoThird;
	}

	/**
	 * Returns the add ins org info third with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add ins org info third
	 * @return the add ins org info third
	 * @throws NoSuchAddInsOrgInfoThirdException if a add ins org info third with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoThird findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddInsOrgInfoThirdException {

		AddInsOrgInfoThird addInsOrgInfoThird = fetchByPrimaryKey(primaryKey);

		if (addInsOrgInfoThird == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddInsOrgInfoThirdException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addInsOrgInfoThird;
	}

	/**
	 * Returns the add ins org info third with the primary key or throws a <code>NoSuchAddInsOrgInfoThirdException</code> if it could not be found.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the add ins org info third
	 * @return the add ins org info third
	 * @throws NoSuchAddInsOrgInfoThirdException if a add ins org info third with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoThird findByPrimaryKey(long AddInsOrgInfoThirdId)
		throws NoSuchAddInsOrgInfoThirdException {

		return findByPrimaryKey((Serializable)AddInsOrgInfoThirdId);
	}

	/**
	 * Returns the add ins org info third with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the add ins org info third
	 * @return the add ins org info third, or <code>null</code> if a add ins org info third with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoThird fetchByPrimaryKey(long AddInsOrgInfoThirdId) {
		return fetchByPrimaryKey((Serializable)AddInsOrgInfoThirdId);
	}

	/**
	 * Returns all the add ins org info thirds.
	 *
	 * @return the add ins org info thirds
	 */
	@Override
	public List<AddInsOrgInfoThird> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add ins org info thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @return the range of add ins org info thirds
	 */
	@Override
	public List<AddInsOrgInfoThird> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add ins org info thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add ins org info thirds
	 */
	@Override
	public List<AddInsOrgInfoThird> findAll(
		int start, int end,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add ins org info thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add ins org info thirds
	 */
	@Override
	public List<AddInsOrgInfoThird> findAll(
		int start, int end,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator,
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

		List<AddInsOrgInfoThird> list = null;

		if (useFinderCache) {
			list = (List<AddInsOrgInfoThird>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDINSORGINFOTHIRD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDINSORGINFOTHIRD;

				sql = sql.concat(AddInsOrgInfoThirdModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddInsOrgInfoThird>)QueryUtil.list(
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
	 * Removes all the add ins org info thirds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddInsOrgInfoThird addInsOrgInfoThird : findAll()) {
			remove(addInsOrgInfoThird);
		}
	}

	/**
	 * Returns the number of add ins org info thirds.
	 *
	 * @return the number of add ins org info thirds
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
					_SQL_COUNT_ADDINSORGINFOTHIRD);

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
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "AddInsOrgInfoThirdId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDINSORGINFOTHIRD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddInsOrgInfoThirdModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add ins org info third persistence.
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

		AddInsOrgInfoThirdUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddInsOrgInfoThirdUtil.setPersistence(null);

		entityCache.removeCache(AddInsOrgInfoThirdImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDINSORGINFOTHIRD =
		"SELECT addInsOrgInfoThird FROM AddInsOrgInfoThird addInsOrgInfoThird";

	private static final String _SQL_SELECT_ADDINSORGINFOTHIRD_WHERE =
		"SELECT addInsOrgInfoThird FROM AddInsOrgInfoThird addInsOrgInfoThird WHERE ";

	private static final String _SQL_COUNT_ADDINSORGINFOTHIRD =
		"SELECT COUNT(addInsOrgInfoThird) FROM AddInsOrgInfoThird addInsOrgInfoThird";

	private static final String _SQL_COUNT_ADDINSORGINFOTHIRD_WHERE =
		"SELECT COUNT(addInsOrgInfoThird) FROM AddInsOrgInfoThird addInsOrgInfoThird WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "addInsOrgInfoThird.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddInsOrgInfoThird exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddInsOrgInfoThird exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddInsOrgInfoThirdPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}