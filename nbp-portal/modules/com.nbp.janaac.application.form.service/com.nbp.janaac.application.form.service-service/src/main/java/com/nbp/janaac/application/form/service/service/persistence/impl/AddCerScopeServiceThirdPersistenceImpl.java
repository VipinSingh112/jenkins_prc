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

import com.nbp.janaac.application.form.service.exception.NoSuchAddCerScopeServiceThirdException;
import com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird;
import com.nbp.janaac.application.form.service.model.AddCerScopeServiceThirdTable;
import com.nbp.janaac.application.form.service.model.impl.AddCerScopeServiceThirdImpl;
import com.nbp.janaac.application.form.service.model.impl.AddCerScopeServiceThirdModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddCerScopeServiceThirdPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddCerScopeServiceThirdUtil;
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
 * The persistence implementation for the add cer scope service third service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddCerScopeServiceThirdPersistence.class)
public class AddCerScopeServiceThirdPersistenceImpl
	extends BasePersistenceImpl<AddCerScopeServiceThird>
	implements AddCerScopeServiceThirdPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddCerScopeServiceThirdUtil</code> to access the add cer scope service third persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddCerScopeServiceThirdImpl.class.getName();

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
	 * Returns all the add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer scope service thirds
	 */
	@Override
	public List<AddCerScopeServiceThird> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @return the range of matching add cer scope service thirds
	 */
	@Override
	public List<AddCerScopeServiceThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer scope service thirds
	 */
	@Override
	public List<AddCerScopeServiceThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer scope service thirds
	 */
	@Override
	public List<AddCerScopeServiceThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator,
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

		List<AddCerScopeServiceThird> list = null;

		if (useFinderCache) {
			list = (List<AddCerScopeServiceThird>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddCerScopeServiceThird addCerScopeServiceThird : list) {
					if (janaacApplicationId !=
							addCerScopeServiceThird.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDCERSCOPESERVICETHIRD_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddCerScopeServiceThirdModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddCerScopeServiceThird>)QueryUtil.list(
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
	 * Returns the first add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer scope service third
	 * @throws NoSuchAddCerScopeServiceThirdException if a matching add cer scope service third could not be found
	 */
	@Override
	public AddCerScopeServiceThird findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddCerScopeServiceThird> orderByComparator)
		throws NoSuchAddCerScopeServiceThirdException {

		AddCerScopeServiceThird addCerScopeServiceThird =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addCerScopeServiceThird != null) {
			return addCerScopeServiceThird;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddCerScopeServiceThirdException(sb.toString());
	}

	/**
	 * Returns the first add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer scope service third, or <code>null</code> if a matching add cer scope service third could not be found
	 */
	@Override
	public AddCerScopeServiceThird fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator) {

		List<AddCerScopeServiceThird> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer scope service third
	 * @throws NoSuchAddCerScopeServiceThirdException if a matching add cer scope service third could not be found
	 */
	@Override
	public AddCerScopeServiceThird findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddCerScopeServiceThird> orderByComparator)
		throws NoSuchAddCerScopeServiceThirdException {

		AddCerScopeServiceThird addCerScopeServiceThird =
			fetchBygetJanaacById_Last(janaacApplicationId, orderByComparator);

		if (addCerScopeServiceThird != null) {
			return addCerScopeServiceThird;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddCerScopeServiceThirdException(sb.toString());
	}

	/**
	 * Returns the last add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer scope service third, or <code>null</code> if a matching add cer scope service third could not be found
	 */
	@Override
	public AddCerScopeServiceThird fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddCerScopeServiceThird> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add cer scope service thirds before and after the current add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerScopeServiceThirdId the primary key of the current add cer scope service third
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer scope service third
	 * @throws NoSuchAddCerScopeServiceThirdException if a add cer scope service third with the primary key could not be found
	 */
	@Override
	public AddCerScopeServiceThird[] findBygetJanaacById_PrevAndNext(
			long addCerScopeServiceThirdId, long janaacApplicationId,
			OrderByComparator<AddCerScopeServiceThird> orderByComparator)
		throws NoSuchAddCerScopeServiceThirdException {

		AddCerScopeServiceThird addCerScopeServiceThird = findByPrimaryKey(
			addCerScopeServiceThirdId);

		Session session = null;

		try {
			session = openSession();

			AddCerScopeServiceThird[] array =
				new AddCerScopeServiceThirdImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addCerScopeServiceThird, janaacApplicationId,
				orderByComparator, true);

			array[1] = addCerScopeServiceThird;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addCerScopeServiceThird, janaacApplicationId,
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

	protected AddCerScopeServiceThird getBygetJanaacById_PrevAndNext(
		Session session, AddCerScopeServiceThird addCerScopeServiceThird,
		long janaacApplicationId,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDCERSCOPESERVICETHIRD_WHERE);

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
			sb.append(AddCerScopeServiceThirdModelImpl.ORDER_BY_JPQL);
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
						addCerScopeServiceThird)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddCerScopeServiceThird> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add cer scope service thirds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddCerScopeServiceThird addCerScopeServiceThird :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addCerScopeServiceThird);
		}
	}

	/**
	 * Returns the number of add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer scope service thirds
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDCERSCOPESERVICETHIRD_WHERE);

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
			"addCerScopeServiceThird.janaacApplicationId = ?";

	public AddCerScopeServiceThirdPersistenceImpl() {
		setModelClass(AddCerScopeServiceThird.class);

		setModelImplClass(AddCerScopeServiceThirdImpl.class);
		setModelPKClass(long.class);

		setTable(AddCerScopeServiceThirdTable.INSTANCE);
	}

	/**
	 * Caches the add cer scope service third in the entity cache if it is enabled.
	 *
	 * @param addCerScopeServiceThird the add cer scope service third
	 */
	@Override
	public void cacheResult(AddCerScopeServiceThird addCerScopeServiceThird) {
		entityCache.putResult(
			AddCerScopeServiceThirdImpl.class,
			addCerScopeServiceThird.getPrimaryKey(), addCerScopeServiceThird);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add cer scope service thirds in the entity cache if it is enabled.
	 *
	 * @param addCerScopeServiceThirds the add cer scope service thirds
	 */
	@Override
	public void cacheResult(
		List<AddCerScopeServiceThird> addCerScopeServiceThirds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addCerScopeServiceThirds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddCerScopeServiceThird addCerScopeServiceThird :
				addCerScopeServiceThirds) {

			if (entityCache.getResult(
					AddCerScopeServiceThirdImpl.class,
					addCerScopeServiceThird.getPrimaryKey()) == null) {

				cacheResult(addCerScopeServiceThird);
			}
		}
	}

	/**
	 * Clears the cache for all add cer scope service thirds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddCerScopeServiceThirdImpl.class);

		finderCache.clearCache(AddCerScopeServiceThirdImpl.class);
	}

	/**
	 * Clears the cache for the add cer scope service third.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddCerScopeServiceThird addCerScopeServiceThird) {
		entityCache.removeResult(
			AddCerScopeServiceThirdImpl.class, addCerScopeServiceThird);
	}

	@Override
	public void clearCache(
		List<AddCerScopeServiceThird> addCerScopeServiceThirds) {

		for (AddCerScopeServiceThird addCerScopeServiceThird :
				addCerScopeServiceThirds) {

			entityCache.removeResult(
				AddCerScopeServiceThirdImpl.class, addCerScopeServiceThird);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddCerScopeServiceThirdImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddCerScopeServiceThirdImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add cer scope service third with the primary key. Does not add the add cer scope service third to the database.
	 *
	 * @param addCerScopeServiceThirdId the primary key for the new add cer scope service third
	 * @return the new add cer scope service third
	 */
	@Override
	public AddCerScopeServiceThird create(long addCerScopeServiceThirdId) {
		AddCerScopeServiceThird addCerScopeServiceThird =
			new AddCerScopeServiceThirdImpl();

		addCerScopeServiceThird.setNew(true);
		addCerScopeServiceThird.setPrimaryKey(addCerScopeServiceThirdId);

		addCerScopeServiceThird.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addCerScopeServiceThird;
	}

	/**
	 * Removes the add cer scope service third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerScopeServiceThirdId the primary key of the add cer scope service third
	 * @return the add cer scope service third that was removed
	 * @throws NoSuchAddCerScopeServiceThirdException if a add cer scope service third with the primary key could not be found
	 */
	@Override
	public AddCerScopeServiceThird remove(long addCerScopeServiceThirdId)
		throws NoSuchAddCerScopeServiceThirdException {

		return remove((Serializable)addCerScopeServiceThirdId);
	}

	/**
	 * Removes the add cer scope service third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add cer scope service third
	 * @return the add cer scope service third that was removed
	 * @throws NoSuchAddCerScopeServiceThirdException if a add cer scope service third with the primary key could not be found
	 */
	@Override
	public AddCerScopeServiceThird remove(Serializable primaryKey)
		throws NoSuchAddCerScopeServiceThirdException {

		Session session = null;

		try {
			session = openSession();

			AddCerScopeServiceThird addCerScopeServiceThird =
				(AddCerScopeServiceThird)session.get(
					AddCerScopeServiceThirdImpl.class, primaryKey);

			if (addCerScopeServiceThird == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddCerScopeServiceThirdException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addCerScopeServiceThird);
		}
		catch (NoSuchAddCerScopeServiceThirdException noSuchEntityException) {
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
	protected AddCerScopeServiceThird removeImpl(
		AddCerScopeServiceThird addCerScopeServiceThird) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addCerScopeServiceThird)) {
				addCerScopeServiceThird = (AddCerScopeServiceThird)session.get(
					AddCerScopeServiceThirdImpl.class,
					addCerScopeServiceThird.getPrimaryKeyObj());
			}

			if (addCerScopeServiceThird != null) {
				session.delete(addCerScopeServiceThird);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addCerScopeServiceThird != null) {
			clearCache(addCerScopeServiceThird);
		}

		return addCerScopeServiceThird;
	}

	@Override
	public AddCerScopeServiceThird updateImpl(
		AddCerScopeServiceThird addCerScopeServiceThird) {

		boolean isNew = addCerScopeServiceThird.isNew();

		if (!(addCerScopeServiceThird instanceof
				AddCerScopeServiceThirdModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addCerScopeServiceThird.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addCerScopeServiceThird);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addCerScopeServiceThird proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddCerScopeServiceThird implementation " +
					addCerScopeServiceThird.getClass());
		}

		AddCerScopeServiceThirdModelImpl addCerScopeServiceThirdModelImpl =
			(AddCerScopeServiceThirdModelImpl)addCerScopeServiceThird;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addCerScopeServiceThird.getCreateDate() == null)) {
			if (serviceContext == null) {
				addCerScopeServiceThird.setCreateDate(date);
			}
			else {
				addCerScopeServiceThird.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addCerScopeServiceThirdModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addCerScopeServiceThird.setModifiedDate(date);
			}
			else {
				addCerScopeServiceThird.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addCerScopeServiceThird);
			}
			else {
				addCerScopeServiceThird =
					(AddCerScopeServiceThird)session.merge(
						addCerScopeServiceThird);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddCerScopeServiceThirdImpl.class, addCerScopeServiceThirdModelImpl,
			false, true);

		if (isNew) {
			addCerScopeServiceThird.setNew(false);
		}

		addCerScopeServiceThird.resetOriginalValues();

		return addCerScopeServiceThird;
	}

	/**
	 * Returns the add cer scope service third with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add cer scope service third
	 * @return the add cer scope service third
	 * @throws NoSuchAddCerScopeServiceThirdException if a add cer scope service third with the primary key could not be found
	 */
	@Override
	public AddCerScopeServiceThird findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddCerScopeServiceThirdException {

		AddCerScopeServiceThird addCerScopeServiceThird = fetchByPrimaryKey(
			primaryKey);

		if (addCerScopeServiceThird == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddCerScopeServiceThirdException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addCerScopeServiceThird;
	}

	/**
	 * Returns the add cer scope service third with the primary key or throws a <code>NoSuchAddCerScopeServiceThirdException</code> if it could not be found.
	 *
	 * @param addCerScopeServiceThirdId the primary key of the add cer scope service third
	 * @return the add cer scope service third
	 * @throws NoSuchAddCerScopeServiceThirdException if a add cer scope service third with the primary key could not be found
	 */
	@Override
	public AddCerScopeServiceThird findByPrimaryKey(
			long addCerScopeServiceThirdId)
		throws NoSuchAddCerScopeServiceThirdException {

		return findByPrimaryKey((Serializable)addCerScopeServiceThirdId);
	}

	/**
	 * Returns the add cer scope service third with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerScopeServiceThirdId the primary key of the add cer scope service third
	 * @return the add cer scope service third, or <code>null</code> if a add cer scope service third with the primary key could not be found
	 */
	@Override
	public AddCerScopeServiceThird fetchByPrimaryKey(
		long addCerScopeServiceThirdId) {

		return fetchByPrimaryKey((Serializable)addCerScopeServiceThirdId);
	}

	/**
	 * Returns all the add cer scope service thirds.
	 *
	 * @return the add cer scope service thirds
	 */
	@Override
	public List<AddCerScopeServiceThird> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add cer scope service thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @return the range of add cer scope service thirds
	 */
	@Override
	public List<AddCerScopeServiceThird> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add cer scope service thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer scope service thirds
	 */
	@Override
	public List<AddCerScopeServiceThird> findAll(
		int start, int end,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add cer scope service thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer scope service thirds
	 */
	@Override
	public List<AddCerScopeServiceThird> findAll(
		int start, int end,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator,
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

		List<AddCerScopeServiceThird> list = null;

		if (useFinderCache) {
			list = (List<AddCerScopeServiceThird>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDCERSCOPESERVICETHIRD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDCERSCOPESERVICETHIRD;

				sql = sql.concat(
					AddCerScopeServiceThirdModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddCerScopeServiceThird>)QueryUtil.list(
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
	 * Removes all the add cer scope service thirds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddCerScopeServiceThird addCerScopeServiceThird : findAll()) {
			remove(addCerScopeServiceThird);
		}
	}

	/**
	 * Returns the number of add cer scope service thirds.
	 *
	 * @return the number of add cer scope service thirds
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
					_SQL_COUNT_ADDCERSCOPESERVICETHIRD);

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
		return "addCerScopeServiceThirdId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDCERSCOPESERVICETHIRD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddCerScopeServiceThirdModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add cer scope service third persistence.
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

		AddCerScopeServiceThirdUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddCerScopeServiceThirdUtil.setPersistence(null);

		entityCache.removeCache(AddCerScopeServiceThirdImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDCERSCOPESERVICETHIRD =
		"SELECT addCerScopeServiceThird FROM AddCerScopeServiceThird addCerScopeServiceThird";

	private static final String _SQL_SELECT_ADDCERSCOPESERVICETHIRD_WHERE =
		"SELECT addCerScopeServiceThird FROM AddCerScopeServiceThird addCerScopeServiceThird WHERE ";

	private static final String _SQL_COUNT_ADDCERSCOPESERVICETHIRD =
		"SELECT COUNT(addCerScopeServiceThird) FROM AddCerScopeServiceThird addCerScopeServiceThird";

	private static final String _SQL_COUNT_ADDCERSCOPESERVICETHIRD_WHERE =
		"SELECT COUNT(addCerScopeServiceThird) FROM AddCerScopeServiceThird addCerScopeServiceThird WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addCerScopeServiceThird.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddCerScopeServiceThird exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddCerScopeServiceThird exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddCerScopeServiceThirdPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}